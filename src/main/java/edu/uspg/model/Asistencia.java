package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asistencia")
public class Asistencia  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idAsistencia;
	
	@ManyToOne
	@JoinColumn(name="id_CursoCatedratico",nullable = false, foreignKey = @ForeignKey(name = "asistencia_curso_catedratico"))
	CursoCatedratico cursoCatedratico;
	@Column(name = "fecha_inicio", nullable = false, length = 10)
	String fechaInicio;
	@Column(name = "fecha_fin", nullable = false, length = 10)
	String fechaFin;
	
		
	public Integer getIdAsistencia() {
		return idAsistencia;
	}
	public void setIdAsistencia(Integer idAsistencia) {
		this.idAsistencia = idAsistencia;
	}
	public CursoCatedratico getCursoCatedratico() {
		return cursoCatedratico;
	}
	public void setCursoCatedratico(CursoCatedratico cursoCatedratico) {
		this.cursoCatedratico = cursoCatedratico;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
		
}