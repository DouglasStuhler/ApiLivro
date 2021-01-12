package com.livraria.livros.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "livros")
public class Livro {

    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull(message = "Este valor não pode estar vazio!")
    @NotBlank(message = "Este valor não pode estar vazio!")
    @Column(name = "nome")
    private String nome;

    @NotNull(message = "Este valor não pode estar vazio!")
    @NotBlank(message = "Este valor não pode estar vazio!")
    @Column(name = "ano")
    private String ano;

    @NotNull(message = "Este valor não pode estar vazio!")
    @NotBlank(message = "Este valor não pode estar vazio!")
    @Column(name = "autor")
    private String autor;
}
