package ar.edu.unlam.pb2.alumno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Alumno {
	private Integer dni;
	private String nombreEstudiante;
	private LocalDate fechaNacimiento;
	private List<LocalDate>asistencias;

	public Alumno(Integer dni, String nombreEsrudiante, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombreEstudiante = nombreEsrudiante;
		this.asistencias = new ArrayList<>();
	}

	public Integer getDni() {
		return dni;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void asistir(LocalDate now) {
		this.asistencias.add(now);
		
		
	}

	public boolean asistio(LocalDate now) {
	 for (LocalDate actual : asistencias) {
		 if (actual.equals(now)) {
			 return true;
		 }
	 }
		return false;
	}

}
