package com.example.primeiraaulaspringboot.controller;


import com.example.primeiraaulaspringboot.model.PessoaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * Essa classe vai ser responsável por  requisições htpp
 */

@RestController
public class HelloWorldController {
    @GetMapping("/pessoa")
    public PessoaModel objetoPessoa(){
        return new PessoaModel("Patrick",22,"Brasília");
    }

    // Esse metodo, sera responsável prea requisição GET do nosso SpringBoot
    @GetMapping("/")
    public String inicio(){
        return "Olá Mundo, eu sou uma aplicação Spring Boot.";
    }
    @GetMapping("/olaComNome/{nome}")
    public String saudarComNome (@PathVariable String nome){
        return "Olá "+nome+", seja bem vindo!";
    }
}
