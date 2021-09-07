package com.example.andar.models;

import javax.persistence.*;

@Entity
@Table(name = "encuesta")
public class EncuestaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Long id;

    @Column
    private String tipo_Encuesta;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_Encuesta() {
        return this.tipo_Encuesta;
    }

    public void setTipo_Encuesta(String tipo_Encuesta) {
        this.tipo_Encuesta = tipo_Encuesta;
    }

}
