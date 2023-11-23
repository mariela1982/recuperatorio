package ar.edu.unlam.pb2.curso;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.alumno.AlumnoDePrimaria;

import ar.edu.unlam.pb2.docente.Docente;

public abstract class Curso {
	private String descripcion ;
	private Integer cursoLectivo;
	private Integer edad;
		private Set<AlumnoDePrimaria>alumnos;
	private Docente maestra;

	public Curso(String descr4ipciomn, Integer curso, Integer edad) {
		this.descripcion= descr4ipciomn;
		this.cursoLectivo = curso;
		this.edad = edad;
		
		this.alumnos = new HashSet<>();
		this.maestra = null;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getCursoLectivo() {
		return cursoLectivo;
	}

	public Integer getEdad() {
		return edad;
	}



	public Set<AlumnoDePrimaria> getAlumnos() {
		return alumnos;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCursoLectivo(Integer cursoLectivo) {
		this.cursoLectivo = cursoLectivo;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public void setAlumnos(Set<AlumnoDePrimaria> alumnos) {
		this.alumnos = alumnos;
	}

	public void setDocente(Docente susana) {
		this.maestra = susana;
		
	}

	public Docente getMaestra() {
		return maestra;
	}

	public void setaCargo(Docente lorusso) {
	
		
	}
	
	

}
