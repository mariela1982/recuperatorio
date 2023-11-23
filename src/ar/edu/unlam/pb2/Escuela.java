package ar.edu.unlam.pb2;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.alumno.Alumno;
import ar.edu.unlam.pb2.alumno.AlumnoDePrimaria;
import ar.edu.unlam.pb2.curso.Curso;
import ar.edu.unlam.pb2.curso.GradoPrimaria;

public class Escuela {
	private String nombre;
	private Set<Curso> cursosPrimaria;
	private Set<Curso> cursosSecundaria;

	public Escuela(String nombre) {
		this.setNombre(nombre);
		this.cursosPrimaria = new HashSet<>();
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void crearCurso(Curso curso) {
		if (curso.getDescripcion().contains("grado")){
			this.cursosPrimaria.add(curso);
			
		} else { 
			this.cursosSecundaria.add(curso);
		}
		}
	

	public void inscribir(Alumno alumno, Integer cicloLectivo) {
		
		Period periodo = Period.between(alumno.getFechaNacimiento(), LocalDate.now());
        Integer edad = periodo.getYears();
       
   
        
        for(GradoPrimaria actual : cursosPrimaria) {
        	if(actual.getCursoLectivo().equals(cicloLectivo)) {
        		
        	}
        }
        
        
        
		
	}
	

}
