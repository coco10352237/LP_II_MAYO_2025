package Interfaces;

import java.util.List;

import Modelo.TblCliente;

public interface ICliente {
//declaramos los metodos
	void RegistrarCliente(TblCliente cliente);
	void ActualizarCliente(TblCliente cliente);
	void EliminarCliente(TblCliente cliente);
	List<TblCliente> ListadoCliente();
	TblCliente BuscarCliente(TblCliente cliente);
}//fin de la interface...
