package com.example.demo.services;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.example.demo.entities.Departamento;
import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	private FuncionarioRepository funcionarioRepository;

	public FuncionarioService (FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario findFuncionarioById(Long id) {
        Optional<Funcionario> Funcionario = funcionarioRepository.findById(id);
        return Funcionario.orElse(null);
    }


    
    public Funcionario insertFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario saveFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

	public Funcionario getFuncionarioById(long funcodigo) {
		return funcionarioRepository.findById(funcodigo).orElse(null);
	}

	public List<Funcionario> getAllFuncionario() {
		return funcionarioRepository.findAll();
	}

	

		
	}

    
