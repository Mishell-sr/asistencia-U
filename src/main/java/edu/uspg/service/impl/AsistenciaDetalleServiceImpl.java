package edu.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.dao.IAsistenciaDetalleDAO;
import edu.uspg.model.AsistenciaDetalle;
import edu.uspg.service.IAsistenciaDetalleService;

@Service
public class AsistenciaDetalleServiceImpl implements IAsistenciaDetalleService {

	@Autowired
	private IAsistenciaDetalleDAO dao;
	
	@Override
	public AsistenciaDetalle registrar(AsistenciaDetalle t) {
		return dao.save(t);
	}

	@Override
	public AsistenciaDetalle modificar(AsistenciaDetalle t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);
	}

	@Override
	public Optional<AsistenciaDetalle> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<AsistenciaDetalle> listar() {
		return dao.findAll();
	}

}