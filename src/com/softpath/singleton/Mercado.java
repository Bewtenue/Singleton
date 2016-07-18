package com.softpath.singleton;

public class Mercado {
	private static Mercado mercado = new Mercado();
	
	public Mercado(){
		
	}
	
	public static Mercado getInstance(){
		return mercado;
	}
	
	public void mostrarMensaje(){
		System.out.println("Mensaje de la instancia singleton");
	}
	
}
