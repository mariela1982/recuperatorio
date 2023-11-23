package ar.edu.unlam.pb2.docente;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.competencia.Grado;

public class Docente {
	private String docente ;
	private List<Grado> gradosQueDicta;

	public Docente(String nombreDelDocente) {
		this.docente = nombreDelDocente;
		this.gradosQueDicta = new ArrayList<>();
		
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public void agregarCompetencia(Grado cuarto) {
		this.gradosQueDicta.add(cuarto);
		
	}

	

	

}
