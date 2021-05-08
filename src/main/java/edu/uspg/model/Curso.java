package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idCurso;
	
	@Column(name = "nombreCurso", nullable = false, length = 70)
	String nombreCurso;
	
	@Column(name = "creditos", nullable = false, length = 10)
	Integer creditos;
	
	
	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCréditos(Integer creditos) {
		this.creditos = creditos;
	}

}