package com.desafio.padroes_projeto.controller;

import com.desafio.padroes_projeto.service.CadastroFacade;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CadastroFacade cadastroFacade;

    public UsuarioController(CadastroFacade cadastroFacade) {
        this.cadastroFacade = cadastroFacade;
    }

    @PostMapping
    public String cadastrar(
            @RequestParam String nome,
            @RequestParam String contato,
            @RequestParam String canal) {
        
        cadastroFacade.registrarUsuarioNovo(nome, contato, canal);
        return "Processo de cadastro concluído para " + nome + " utilizando canal " + canal + "!";
    }
}

