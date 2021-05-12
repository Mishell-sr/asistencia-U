package edu.uspg.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asistencia_detalle")
public class AsistenciaDetalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idAsistenciaDetalle;
	@ManyToOne
	@JoinColumn(name="id_asistencia",nullable = false, foreignKey = @ForeignKey(name = "asistencia_detalle_asistencia"))
	Asistencia asistencia;
	@ManyToOne
	@JoinColumn(name="id_Alumno",nullable = false, foreignKey = @ForeignKey(name = "asistencia_detalle_alumno"))
	Alumno alumno;
	@ManyToOne
	@JoinColumn(name="id_Token",nullable = false, foreignKey = @ForeignKey(name = "asistencia_detalle_token"))
	Token token;
	
	
	public Integer getIdAsistenciaDetalle() {
		return idAsistenciaDetalle;
	}
	public void setIdAsistenciaDetalle(Integer idAsistenciaDetalle) {
		this.idAsistenciaDetalle = idAsistenciaDetalle;
	}
	public Asistencia getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(Asistencia asistencia) {
		this.asistencia = asistencia;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Token getToken() {
		return token;
	}
	public void setToken(Token token) {
		this.token = token;
	}
	

}