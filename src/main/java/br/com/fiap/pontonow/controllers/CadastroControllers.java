package br.com.fiap.pontonow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fiap.pontonow.models.Cadastro;

@Controller
public class CadastroControllers {

    @RequestMapping("/api/cadastro")
    @ResponseBody
    public Cadastro show(){
        Cadastro cadastro = new Cadastro("Wesley Kleim ", "427.405.028.93", "Masculino", "Desenvolvedor Java");
         return cadastro; 
        
    }
}
