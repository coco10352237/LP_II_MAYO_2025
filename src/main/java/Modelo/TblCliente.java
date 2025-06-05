package Modelo;

import javax.persistence.*;

@Entity
@Table(name="tbl_cliente")
@NamedQuery(name="TblCliente.findAll",query="Select t from TblCliente t")
public class TblCliente {
//declaramos sus atributos..
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int idcliente;
@Column(name="nombre")//para referenciar a los campos de la tabla en mysql
private String nomcliente;
@Column(name="apellido")
private String apecliente;
@Column(name="dni")
private String dnicliente;
@Column(name="email")
private String emaicliente;
@Column(name="telef")
private String telcliente;
@Column(name="sexo")
private String sexcliente;
@Column(name="nacionalidad")
private String nacioncliente;

public TblCliente(){
	
} //fin del constructor vacio...



public TblCliente(int idcliente, String nomcliente, String apecliente, String dnicliente, String emaicliente,
		String telcliente, String sexcliente, String nacioncliente) {
	//super();
	this.idcliente = idcliente;
	this.nomcliente = nomcliente;
	this.apecliente = apecliente;
	this.dnicliente = dnicliente;
	this.emaicliente = emaicliente;
	this.telcliente = telcliente;
	this.sexcliente = sexcliente;
	this.nacioncliente = nacioncliente;
}//fin del constructor con parametros....
//getters y setters.....
public int getIdcliente() {
	return idcliente;
}
public void setIdcliente(int idcliente) {
	this.idcliente = idcliente;
}
public String getNomcliente() {
	return nomcliente;
}
public void setNomcliente(String nomcliente) {
	this.nomcliente = nomcliente;
}
public String getApecliente() {
	return apecliente;
}
public void setApecliente(String apecliente) {
	this.apecliente = apecliente;
}
public String getDnicliente() {
	return dnicliente;
}
public void setDnicliente(String dnicliente) {
	this.dnicliente = dnicliente;
}
public String getEmaicliente() {
	return emaicliente;
}
public void setEmaicliente(String emaicliente) {
	this.emaicliente = emaicliente;
}
public String getTelcliente() {
	return telcliente;
}
public void setTelcliente(String telcliente) {
	this.telcliente = telcliente;
}
public String getSexcliente() {
	return sexcliente;
}
public void setSexcliente(String sexcliente) {
	this.sexcliente = sexcliente;
}
public String getNacioncliente() {
	return nacioncliente;
}
public void setNacioncliente(String nacioncliente) {
	this.nacioncliente = nacioncliente;
}
	


	
	
	
}//fin de la clase....
