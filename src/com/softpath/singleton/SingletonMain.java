package com.softpath.singleton;

public class SingletonMain {
	public static void main(String[] args) {
		
		Mercado mercado = Mercado.getInstance();
		mercado.mostrarMensaje();
		
		
		
	}
}
