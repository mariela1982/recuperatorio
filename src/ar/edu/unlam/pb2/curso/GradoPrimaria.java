package ar.edu.unlam.pb2.curso;



import ar.edu.unlam.pb2.competencia.Grado;

public class GradoPrimaria extends Curso{
	
	private Grado grado;
	

	public GradoPrimaria(String descr4ipciomn, Integer curso, Integer edad, Grado tercero) {
		super(descr4ipciomn, curso, edad);
		this.grado = tercero;
	
	}

	public Grado getGrado() {
		return grado;
	}


	public void setGrado(Grado grado) {
		this.grado = grado;
	}

	

}
