package com.livraria.livros.controller;

import com.livraria.livros.model.Livro;
import com.livraria.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ListarController {

    @Autowired
    private LivroRepository lr;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("listar");
        List<Livro> livro = lr.findAll();
        mv.addObject("livro", livro);
        return mv;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.POST)
    public ModelAndView deletar(Long codigo){
        System.out.println(codigo);
        Livro livroDelete = lr.findByCodigo(codigo);

        lr.delete(livroDelete);

        ModelAndView mv = new ModelAndView("listar");
        List<Livro> livro = lr.findAll();
        mv.addObject("livro", livro);
        return mv;
    }
}
