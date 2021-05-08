package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catedratico")
public class Catedratico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idCatedratico;
	
	@Column(name = "nombresCatedratico", nullable = false, length = 30)
	String nombresCatedratico;
	
	@Column(name = "apellidosCatedratico", nullable = false, length = 30)
	String apellidosCatedratico;
	
	@Column(name = "gradoAcademico", nullable = false, length = 100)
	String gradoAcademico;
	
	@Column(name = "correo", nullable = false, length = 30)
	String correo;
	
	@Column(name = "telefono", nullable = true, length = 10)
	String telefono;

	public Integer getIdCatedratico() {
		return idCatedratico;
	}

	public void setIdCatedratico(Integer idCatedratico) {
		this.idCatedratico = idCatedratico;
	}

	public String getNombresCatedratico() {
		return nombresCatedratico;
	}

	public void setNombresCatedratico(String nombresCatedratico) {
		this.nombresCatedratico = nombresCatedratico;
	}

	public String getApellidosCatedratico() {
		return apellidosCatedratico;
	}

	public void setApellidosCatedratico(String apellidosCatedratico) {
		this.apellidosCatedratico = apellidosCatedratico;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
}