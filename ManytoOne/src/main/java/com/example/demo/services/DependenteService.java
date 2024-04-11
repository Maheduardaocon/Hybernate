package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Dependente;
import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.DependenteRepository;

@Service
public class DependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    public DependenteService (DependenteRepository dependenteRepository) {
        this.dependenteRepository = dependenteRepository;
    }

    
    public Dependente findDependenteById(Long id) {
        Optional<Dependente> Dependente = dependenteRepository.findById(id);
        return Dependente.orElse(null);
    }

   
    public List<Dependente> findAllDependente() {
        return dependenteRepository.findAll();
    }

    
    public Dependente insertDependente(Dependente dependente) {
        return dependenteRepository.save(dependente);
    }
    
    public Dependente saveDependente(Dependente dependente) {
        return dependenteRepository.save(dependente);
    }

	public Dependente getDependenteById(long funcodigo) {
		return dependenteRepository.findById(funcodigo).orElse(null);
	}

	public List<Dependente> getAllDependente() {
		return dependenteRepository.findAll();
	}
    
}
