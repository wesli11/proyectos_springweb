package service;

import java.util.List;

import model.Persona;

public interface AgengaService {
	
	public void agregar(Persona p);
	public Persona buscarPorEmail(String email);
	public void eliminarPorEmail(String email);
	public List<Persona>listaPersonas();

}
