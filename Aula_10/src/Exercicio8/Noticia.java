package Exercicio8;

/**
 * 
 * @author João Victor Bonfim Rocha - RA:816118224 - Turma:SIN3AN-MCA
 * 			
 *
 */

public class Noticia {
	String textoNoticia;
	int dia;
	int mes;
	String topico;
	public String getTextoNoticia() {
		return textoNoticia;
	}
	public void setTextoNoticia(String textoNoticia) {
		this.textoNoticia = textoNoticia;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getTopico() {
		return topico;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}
	public Noticia(String textoNoticia, int dia, int mes, String topico) {
		super();
		this.textoNoticia = textoNoticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;
	}
	@Override
	public String toString() {
		return "Noticia [textoNoticia=" + textoNoticia + ", dia=" + dia + ", mes=" + mes + ", topico=" + topico + "]";
	}
	
	
	

}