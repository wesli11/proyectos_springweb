package service;

import model.Persona;

public interface AgengaService {
	
	public void agregar(Persona p);
	public Persona buscarPorEmail(String email);
	public void eliminarPorEmail(String email);

}
