package br.com.etecfer.etecfer.service;

import java.security.spec.DSAGenParameterSpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.etecfer.etecfer.entity.Aluno;
import br.com.etecfer.etecfer.repository.AlunoRepository;

@Service
public class AlunoService {
    
    //injeção de dependencia do repositorio para a classe aluno
    @Autowired
    private AlunoRepository alunoRepository;

    //metodo para salvar um aluno
    public Aluno save(Aluno aluno){
        return alunoRepository.save(aluno);
    }

}
