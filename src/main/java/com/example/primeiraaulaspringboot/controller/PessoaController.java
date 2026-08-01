package com.example.primeiraaulaspringboot.controller;


import com.example.primeiraaulaspringboot.model.PessoaModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    //LISTA QUE IRÁ GUARDAR TODOS OS NOSSOS OBJETOS
    private final ArrayList<PessoaModel> pessoas = new ArrayList<>();

    //localhost:8080/pessoa/listaPessoas
    @GetMapping("/listaPessoas")
    public  ArrayList<PessoaModel> listaPessoa(){
        return pessoas;
    }
    //localhost:8080/pessoa/adicionarPessoa

    @PostMapping("/adicionarPessoa")
    public PessoaModel adicionarPessoa(@RequestBody PessoaModel novaPessoa){
        pessoas.add(novaPessoa);
        return novaPessoa;
    }
}
