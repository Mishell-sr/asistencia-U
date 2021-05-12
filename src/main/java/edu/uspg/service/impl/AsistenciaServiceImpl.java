package edu.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.dao.IAsistenciaDAO;
import edu.uspg.model.Asistencia;
import edu.uspg.service.IAsistenciaService;

@Service
public class AsistenciaServiceImpl implements IAsistenciaService {

	@Autowired
	private IAsistenciaDAO dao;
	
	@Override
	public Asistencia registrar(Asistencia t) {
		return dao.save(t);
	}

	@Override
	public Asistencia modificar(Asistencia t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<Asistencia> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Asistencia> listar() {
		return dao.findAll();
	}

}