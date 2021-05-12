package edu.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.Asistencia;

public interface IAsistenciaDAO extends JpaRepository<Asistencia, Integer> {

}
