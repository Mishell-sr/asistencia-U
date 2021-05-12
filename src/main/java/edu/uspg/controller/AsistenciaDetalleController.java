package edu.uspg.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.uspg.exception.ModeloNotFoundException;
import edu.uspg.model.AsistenciaDetalle;
import edu.uspg.service.IAsistenciaDetalleService;

@RestController
@RequestMapping("/asistencia_detalle")
public class AsistenciaDetalleController {

	@Autowired
	private IAsistenciaDetalleService service;
	
	/*list all*/
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AsistenciaDetalle>> listar(){
		return new ResponseEntity<List<AsistenciaDetalle>>(service.listar(), HttpStatus.OK);
	}
	
	/*list for id*/
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AsistenciaDetalle> listarPorId(@PathVariable("id") Integer id){
		Optional<AsistenciaDetalle> asistenciaDetalle = service.listarPorId(id);
		if(!asistenciaDetalle.isPresent()) {
			throw new ModeloNotFoundException("id no encontrado: " + id);
		} 
		return new ResponseEntity<AsistenciaDetalle>(asistenciaDetalle.get(), HttpStatus.OK);
	}
	
	/*register*/
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
				 consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> registrar(@RequestBody AsistenciaDetalle asisDet){
		AsistenciaDetalle asistenciaDetalle = new AsistenciaDetalle();
		asistenciaDetalle = service.registrar(asisDet);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(asistenciaDetalle.getIdAsistenciaDetalle()).toUri();
		return ResponseEntity.created(location).build();	
	}
	
	/*UPDATE*/
	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, 
			    consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> modificar(@RequestBody AsistenciaDetalle asisDet) {
		service.modificar(asisDet);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		Optional<AsistenciaDetalle> asisDet = service.listarPorId(id);
		if(!asisDet.isPresent()) {
			throw new ModeloNotFoundException("id no encontrado: " + id);
		} else {
			service.eliminar(id);
		}
	}
	
}