package com.sanvalero.examenWebinar2.model;

public class Cuadro {
	
	private String nombre;
	private String tecnica;
	private double anchura;
	private double altura;
	private int valoracion;
	
	public Cuadro(String nombre, String tecnica, double anchura, double altura, int valoracion) {
		super();
		this.nombre = nombre;
		this.tecnica = tecnica;
		this.anchura = anchura;
		this.altura = altura;
		this.valoracion = valoracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	
}
