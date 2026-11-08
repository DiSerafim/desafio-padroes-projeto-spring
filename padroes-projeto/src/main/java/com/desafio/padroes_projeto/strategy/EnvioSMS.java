package com.desafio.padroes_projeto.strategy;

import org.springframework.stereotype.Component;

@Component("sms")
public class EnvioSMS implements NotificacaoStrategy {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("💬 SMS enviado para " + destinatario + ": " + mensagem);
    }
}

