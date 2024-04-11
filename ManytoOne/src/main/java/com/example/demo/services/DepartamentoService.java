package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Departamento;
import com.example.demo.entities.Dependente;
import com.example.demo.repositories.DepartamentoRepository;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public DepartamentoService (DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    
    public Departamento findDepartamentoById(Long id) {
        Optional<Departamento> Departamento = departamentoRepository.findById(id);
        return Departamento.orElse(null);
    }

   
    public List<Departamento> findAllDepartamento() {
        return departamentoRepository.findAll();
    }

    
    public Departamento insertDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public Departamento saveDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

	public Departamento getDepartamentoById(long funcodigo) {
		return departamentoRepository.findById(funcodigo).orElse(null);
	}
	
	public List<Departamento> getAllDepartamento() {
		return departamentoRepository.findAll();
	}

    
}
