package com.gati.androidlistview;

public class Titular {
	private String titulo;
	private String subtitulo;

	public Titular(String titulo, String subtitulo){
		this.titulo = titulo;
		this.subtitulo = subtitulo;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public String getSubtitulo(){
		return subtitulo;
	}
}
