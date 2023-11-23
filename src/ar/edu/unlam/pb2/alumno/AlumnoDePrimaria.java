package ar.edu.unlam.pb2.alumno;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.evaluacion.Evaluacion;

public class AlumnoDePrimaria extends Alumno {

	public AlumnoDePrimaria(Integer dni, String nombreEsrudiante, LocalDate fechaNacimiento) {
		super(dni, nombreEsrudiante, fechaNacimiento);
		
	}

	public void rendir(Evaluacion evaluacionTercerTrimestreCuartoGrado, File archivoResolucion) {
		
		
	}
	
}
