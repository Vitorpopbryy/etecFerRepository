package br.com.etecfer.etecfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.etecfer.etecfer.entity.Aluno;
import br.com.etecfer.etecfer.service.AlunoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/aluno")
public class AlunoController {
    
    //injeção de dependencia da service para a classe aluno
    @Autowired
    private AlunoService alunoService;

    //metodo para salvar um aluno 
    @PostMapping("path")
    public String postMethodName(@ModelAttribute Aluno aluno) {
    alunoService.save(aluno);
        
        return "redirect:/alunos/listar";
    }
    //metodo para listar todos os alunos
    @GetMapping("/listar")
    public String listar(Model model) {
       List<Aluno> alunos = alunoService.findAll();
       model.addAttribute("alunos", alunos);
        return "aluno/ListarAlunos";
    }
    
    
}
