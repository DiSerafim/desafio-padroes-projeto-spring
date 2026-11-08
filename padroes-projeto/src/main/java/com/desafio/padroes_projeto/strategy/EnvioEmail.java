package com.desafio.padroes_projeto.strategy;

import org.springframework.stereotype.Component;

@Component("email")
public class EnvioEmail implements NotificacaoStrategy {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("📧 E-mail enviado para " + destinatario + ": " + mensagem);
    }
}
