package Modelo;

public class TblUsuario {

	//declaramos los atributos
	private int idusuario;
	private String nomusuario;
	private String passusuario;
	
	public TblUsuario(){
		
	} //fin del constructor vacio....
	
	public TblUsuario(int idusuario, String nomusuario, String passusuario) {
		//super();
		this.idusuario = idusuario;
		this.nomusuario = nomusuario;
		this.passusuario = passusuario;
	}//fin del constructor con parametros...
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNomusuario() {
		return nomusuario;
	}
	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}
	public String getPassusuario() {
		return passusuario;
	}
	public void setPassusuario(String passusuario) {
		this.passusuario = passusuario;
	}
	
	
} //fin de la clase...
