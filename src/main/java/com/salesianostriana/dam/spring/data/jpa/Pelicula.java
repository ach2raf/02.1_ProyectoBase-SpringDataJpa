package com.salesianostriana.dam.spring.data.jpa;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@Builder
public class Pelicula {
    @Id
    @GeneratedValue
    Long id;

    String titulo;

    Integer anioEsterno;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Critica> criticas=new ArrayList<>();


    @OneToMany
    private List<Genero> generos=new ArrayList<>();

    //metodos helper

    public Pelicula addCritica(Critica critica){
            criticas.add(critica);
            critica.setPelicula(this);
            return this;
        }



    public Pelicula removeCritica(Critica critica){
           criticas.remove(critica);
    critica.setPelicula(null);
           return this;
    }
}

