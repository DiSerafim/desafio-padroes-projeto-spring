package com.desafio.padroes_projeto.service;

import com.desafio.padroes_projeto.strategy.NotificacaoStrategy;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class NotificacaoService {

    // O Spring injeta automaticamente todos os beans do tipo NotificacaoStrategy neste mapa usando o nome do componente como chave
    private final Map<String, NotificacaoStrategy> estrategias;

    public NotificacaoService(Map<String, NotificacaoStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public void enviarNotificacao(String tipo, String destinatario, String mensagem) {
        NotificacaoStrategy estrategia = estrategias.get(tipo.toLowerCase());
        if (estrategia == null) {
            throw new IllegalArgumentException("Tipo de envio não suportado: " + tipo);
        }
        estrategia.enviar(destinatario, mensagem);
    }
}

