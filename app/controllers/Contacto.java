package controllers;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.Grupo;
import play.db.jpa.Model;

@Entity
public class Contacto extends Model {
	
	public String nombre;
	public String numero;
	@ManyToOne
	
	public int grupo;
	
	
	public Contacto(String nombre, String numero, Grupo grupo) {
		
		this.nombre = nombre;
		this.numero = numero;
		this.grupo = grupo;
	}


	public Contacto(String nombre, String numero,int    grupo) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.grupo = grupo;
	}
	

	                                                                                         
	
	

}
