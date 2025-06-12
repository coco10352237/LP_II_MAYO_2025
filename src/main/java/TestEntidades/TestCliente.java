package TestEntidades;

import java.util.List;

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
		
		/*//testeando el actualizar...
		tblcliente.setIdcliente(1);
		tblcliente.setNomcliente("luis miguel");
		tblcliente.setApecliente("ramirez");
		tblcliente.setDnicliente("45679799");
		tblcliente.setEmaicliente("miguel@gmail.com");
		tblcliente.setSexcliente("m");
		tblcliente.setTelcliente("345679");
		tblcliente.setNacioncliente("peruana");
		//invocamos el metodo actualizar
		cli.ActualizarCliente(tblcliente);
		System.out.println("cliente actualizado");*/
     /*  //********testear el metodo eliminar...
		tblcliente.setIdcliente(1);
		//invoco al metodo eliminar
		cli.EliminarCliente(tblcliente);
		System.out.println("cliente eliminado");*/
		//******testear el metodo listado
		List<TblCliente> listar=cli.ListadoCliente();
		//aplicamos un bucle for...
		for(TblCliente lis:listar){
		//imprimimos por pantalla
			System.out.println("codigo "+
		lis.getIdcliente()+
		" nombre "+lis.getNomcliente()+
		" apellido "+lis.getApecliente());
		} //fin del bucle ...
		
		
	} //fin del metodo principal.....

} //fin de la clase..
