package com.livraria.livros.repository;

import com.livraria.livros.model.Livro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LivroRepository extends CrudRepository<Livro, Long> {

    //listando
    List<Livro> findAll();

    //Listando selecionado
    Livro findByCodigo(Long codigo);

    //Deletar informações
    void delete(Livro livro);

    //salvando
    <livroRepo extends Livro> livroRepo save(livroRepo livro);
}
