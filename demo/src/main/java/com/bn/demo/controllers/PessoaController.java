package com.bn.demo.controllers;

import com.bn.demo.models.PessoaModel;
import com.bn.demo.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {


    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll(){
        return  pessoaService.findAll();
    }

    @PostMapping
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoaModel){
        return  pessoaService.criarPessoa(pessoaModel);
    }


    @GetMapping("/{id}")
    public Optional<PessoaModel> buscarId(@PathVariable Long id){
        return  pessoaService.buscarid(id);
    }


}
