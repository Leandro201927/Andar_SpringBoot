package com.example.andar.models;

import javax.persistence.*;

@Entity @IdClass(SubcategoriaKey.class)
@Table(name = "subcategoria")
public class SubcategoriaModel {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Long id;

    @Id
    private Long categoria_Id;

    @Column
    private String subCategoria;
    @Column
    private String tarifa;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoria_Id() {
        return this.categoria_Id;
    }

    public void setCategoria_Id(Long categoria_Id) {
        this.categoria_Id = categoria_Id;
    }

    public String getSubCategoria() {
        return this.subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getTarifa() {
        return this.tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

}