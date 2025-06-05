package TestEntidades;

import Dao.ClienteImp;
import Modelo.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		//instanciamos la clases...
		TblCliente tblcliente=new TblCliente();
		ClienteImp cli=new ClienteImp();
		//asignamos valores
	/*	tblcliente.setNomcliente("miguel");
		tblcliente.setApecliente("ramirez");
		tblcliente.setDnicliente("45679799");
		tblcliente.setEmaicliente("miguel@gmail.com");
		tblcliente.setSexcliente("M");
		tblcliente.setTelcliente("345679");
		tblcliente.setNacioncliente("peruana");
		//invocamos el metodo registrar
		cli.RegistrarCliente(tblcliente);
		System.out.println("cliente registrado");*/
		
		//testeando el actualizar...
		tblcliente.setIdcliente(1);
		tblcliente.setNomcliente("flor de liz");
		tblcliente.setApecliente("ramirez");
		tblcliente.setDnicliente("45679799");
		tblcliente.setEmaicliente("miguel@gmail.com");
		tblcliente.setSexcliente("f");
		tblcliente.setTelcliente("345679");
		tblcliente.setNacioncliente("peruana");
		//invocamos el metodo actualizar
		cli.ActualizarCliente(tblcliente);
		System.out.println("cliente actualizado");
          
	} //fin del metodo principal.....

} //fin de la clase..
