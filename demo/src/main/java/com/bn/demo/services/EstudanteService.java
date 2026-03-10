package com.bn.demo.services;

import com.bn.demo.models.EstudanteModel;
import com.bn.demo.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public List<EstudanteModel> findAll(){
        return  estudanteRepository.findAll();
    }

    public EstudanteModel criarPessoa(EstudanteModel estudanteModel){
        return  estudanteRepository.save(estudanteModel);
    }

    public Optional<EstudanteModel> buscarid(Long id){
        return  estudanteRepository.findById(id);
    }

    public EstudanteModel atualizar(Long id, EstudanteModel estudanteModel){
        EstudanteModel model = estudanteRepository.findById(id).get();
        model.setNome(estudanteModel.getNome());
        return estudanteRepository.save(model);
    }

    public void deletar(Long id){
        estudanteRepository.deleteById(id);
    }

}
