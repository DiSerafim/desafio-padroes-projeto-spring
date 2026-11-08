package com.desafio.padroes_projeto.strategy;

public interface NotificacaoStrategy {
    void enviar(String destinatario, String mensagem);
}
