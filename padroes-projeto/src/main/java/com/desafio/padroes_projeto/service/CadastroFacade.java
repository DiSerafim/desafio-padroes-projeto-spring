package com.desafio.padroes_projeto.service;

import org.springframework.stereotype.Component;

@Component
public class CadastroFacade {

    private final NotificacaoService notificacaoService;

    public CadastroFacade(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    public void registrarUsuarioNovo(String nome, String contato, String canalPreferido) {
        // Subsistema 1: Simulação de persistência
        System.out.println("💾 Salvando usuário no banco de dados: " + nome);

        // Subsistema 2: Disparo de boas-vindas encapsulado via Facade
        String mensagemBoasVindas = "Olá " + nome + ", seu cadastro no sistema foi realizado com sucesso!";
        notificacaoService.enviarNotificacao(canalPreferido, contato, mensagemBoasVindas);
    }
}
