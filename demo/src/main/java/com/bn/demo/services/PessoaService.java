package com.bn.demo.services;

import com.bn.demo.models.PessoaModel;
import com.bn.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll(){
        return  pessoaRepository.findAll();
    }

    public PessoaModel  criarPessoa(PessoaModel pessoaModel){
        return  pessoaRepository.save(pessoaModel);
    }

    public Optional<PessoaModel> buscarid(Long id){
        return  pessoaRepository.findById(id);
    }




}
