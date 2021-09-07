package com.example.andar.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity @IdClass(ContactoEmergenciaKey.class)
@Table(name = "contacto_emergencia")
public class ContactoEmergenciaModel implements Serializable{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Long id;

    @Id
    private Long usuario_Id;

    @Column
    private String nombre;
    @Column
    private String celular;
    @Column
    private String correo;
    @Column
    private Date fecha_Creacion;
    @Column
    private Date fecha_Modificacion;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuario_Id() {
        return this.usuario_Id;
    }

    public void setUsuario_Id(Long usuario_Id) {
        this.usuario_Id = usuario_Id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha_Creacion() {
        return this.fecha_Creacion;
    }

    public void setFecha_Creacion(Date fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }


    public Date getFecha_Modificacion() {
        return this.fecha_Modificacion;
    }

    public void setFecha_Modificacion(Date fecha_Modificacion) {
        this.fecha_Modificacion = fecha_Modificacion;
    }

}
