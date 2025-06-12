package Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="tbl_usuario")
@NamedQuery(name="TblUsuario.findAll",query="Select t from TblCliente t")
public class TblUsuario {

	//declaramos los atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
