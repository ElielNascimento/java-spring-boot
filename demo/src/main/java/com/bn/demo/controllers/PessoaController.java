package com.bn.demo.controllers;

import com.bn.demo.models.EstudanteModel;
import com.bn.demo.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {


    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public List<EstudanteModel> findAll(){
        return  estudanteService.findAll();
    }

    @PostMapping
    public EstudanteModel criarPessoa(@RequestBody EstudanteModel estudanteModel){
        return  estudanteService.criarPessoa(estudanteModel);
    }


    @GetMapping("/{id}")
    public Optional<EstudanteModel> buscarId(@PathVariable Long id){
        return  estudanteService.buscarid(id);
    }


}
