package com.example.andar.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Long id;

	@Column
	private Long tipo_Documento;
	@Column
	private String numero_Documento;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private Date fecha_Nacimiento;
	@Column
	private String correo;
	@Column
	private String celular;
	@Column
	private String password;
	@Column
	private String url_Foto_Perfil_S3;
	@Column
	private Date fecha_Creacion;
	@Column
	private Date fecha_Modificacion;
	@Column
	private String tipo;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTipo_Documento() {
		return this.tipo_Documento;
	}

	public void setTipo_Documento(Long tipo_Documento) {
		this.tipo_Documento = tipo_Documento;
	}

	
	public String getNumero_Documento() {
		return this.numero_Documento;
	}

	public void setNumero_Documento(String numero_Documento) {
		this.numero_Documento = numero_Documento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_Nacimiento() {
		return this.fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(Date fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl_Foto_Perfil_S3() {
		return this.url_Foto_Perfil_S3;
	}

	public void setUrl_Foto_Perfil_S3(String url_Foto_Perfil_S3) {
		this.url_Foto_Perfil_S3 = url_Foto_Perfil_S3;
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

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}