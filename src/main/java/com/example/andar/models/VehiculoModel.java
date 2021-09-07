package com.example.andar.models;

import javax.persistence.*;

@Entity @IdClass(VehiculoKey.class)
@Table(name = "vehiculo")
public class VehiculoModel {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Long placa;
    @Id
    private Long categoria_Id;
    @Id
    private Long usuario_Id;

    @Column
    private String tipo;
    @Column
    private String marca;
    @Column
    private String referencia;
    @Column
    private String estado;

    public Long getPlaca() {
        return this.placa;
    }

    public void setPlaca(Long placa) {
        this.placa = placa;
    }

    public Long getCategoria_Id() {
        return this.categoria_Id;
    }

    public void setCategoria_Id(Long categoria_Id) {
        this.categoria_Id = categoria_Id;
    }

    public Long getUsuario_Id() {
        return this.usuario_Id;
    }

    public void setUsuario_Id(Long usuario_Id) {
        this.usuario_Id = usuario_Id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
