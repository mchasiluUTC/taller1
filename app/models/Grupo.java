package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import java.util.*;

@Entity
public class Grupo extends Model {
	String nombre;
	String descripcion;
	
	public Grupo (String nombre, String descripcion){
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		
		
	}

}
