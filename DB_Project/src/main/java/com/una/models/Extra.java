package com.una.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "extra")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Extra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "precioPersona")
    private Integer price;
    @OneToMany(mappedBy = "extra")
    private List<DetailExtra> detailsExtra;
}
