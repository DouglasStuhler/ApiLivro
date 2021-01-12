package com.livraria.livros.controller;

import com.livraria.livros.model.Livro;
import com.livraria.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Controller
public class LivrosController {

    @Autowired
    private LivroRepository lr;

    @RequestMapping(value = "/cadastrarLivro", method = RequestMethod.GET)
    public String formulario(){
        return "formCad";
    }

    @RequestMapping(value = "/cadastrarLivro", method = RequestMethod.POST)
    public String salva(@Valid Livro livro, BindingResult br){
        if (br.hasErrors()){
            return "formCad";
        } else  {
            lr.save(livro);
            return "redirect:/listar";
        }
    }
}
