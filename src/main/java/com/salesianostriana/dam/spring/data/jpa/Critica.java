package com.salesianostriana.dam.spring.data.jpa;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@Builder
public class Critica {
    @Id
    @GeneratedValue
    Long id;

    String autor;

    String texto;

    String puntuacion;

    @ManyToOne
    @JoinColumn(name = "pelicula_id",
    foreignKey = @ForeignKey(name = "PELICULA_ID-FK"))
    private Pelicula pelicula;
}
