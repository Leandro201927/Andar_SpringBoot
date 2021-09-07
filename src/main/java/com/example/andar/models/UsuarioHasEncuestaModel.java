package com.example.andar.models;

import javax.persistence.*;

@Entity @IdClass(UsuarioHasEncuestaKey.class)
@Table(name = "usuario_has_encuesta")
public class UsuarioHasEncuestaModel {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Long id;

    @Id
    private Long encuesta_Id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEncuesta_Id() {
        return this.encuesta_Id;
    }

    public void setEncuesta_Id(Long encuesta_Id) {
        this.encuesta_Id = encuesta_Id;
    }
}
