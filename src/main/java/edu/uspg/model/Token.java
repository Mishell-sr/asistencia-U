package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table
public class Token {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idToken;
	@Column(name = "token", nullable = false, length = 10)
	String token;
	@ManyToOne
	@JoinColumn(name="id_curso_catedratico",nullable = false, foreignKey = @ForeignKey(name = "token_curso_catedratico"))
	CursoCatedratico cursoCatedratico;
	
	
	public Integer getIdToken() {
		return idToken;
	}
	public void setIdToken(Integer idToken) {
		this.idToken = idToken;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public CursoCatedratico getCursoCatedratico() {
		return cursoCatedratico;
	}
	public void setCursoCatedratico(CursoCatedratico cursoCatedratico) {
		this.cursoCatedratico = cursoCatedratico;
	}
		
}