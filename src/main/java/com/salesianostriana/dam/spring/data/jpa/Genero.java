package com.salesianostriana.dam.spring.data.jpa;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@Builder
public class Genero {
    @Id
    @GeneratedValue
    Long id;

    String nombre;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Pelicula> peliculas=new ArrayList<>();
}
