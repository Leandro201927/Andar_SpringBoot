package com.example.andar.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity @IdClass(PreguntasKey.class)
@Table(name = "preguntas")
public class PreguntasModel implements Serializable {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Long id;

    @Id
    private Long encuesta_Id;

    @Column
    private String pregunta;

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

    public String getPregunta() {
        return this.pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

}
