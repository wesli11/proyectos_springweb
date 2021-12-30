package service;

import java.util.ArrayList;
import java.util.List;

import model.Persona;

public class AgendaServiceImpl implements AgengaService{

	List<Persona> lista=new ArrayList<>();
	
	@Override
	public void agregar(Persona p) {
       Persona persona=new Persona(p.getNombre(),p.getTelefono(),p.getEmail());
       lista.add(persona);
	}

	@Override
	public Persona buscarPorEmail(String email) {
      for(int i=0;i<lista.size();i++) {
        if(lista.get(i).getEmail().equals(email)) {
        	return lista.get(i);
        }
      }
		return null;
	}

	@Override
	public void eliminarPorEmail(String email) {
		// TODO Auto-generated method stub
		
	}

}
