package com.example.proyecto3.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String nombre;

    @Column(name = "fechanac")
    private LocalDate fechaNacimiento;

    private String telefono;
    private String email;
}