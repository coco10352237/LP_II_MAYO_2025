package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import Modelo.TblCliente;

public class ClienteImp implements ICliente {

	public void RegistrarCliente(TblCliente cliente) {
	//nos conectamos con la unidad de persist....
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMysqlMiercoles");
		//para administrar la entidades
		EntityManager em=emf.createEntityManager();
		try{
		//iniciar transaccion
		em.getTransaction().begin();
		//invocamos al metodo registrar
		//en jdbc(LPI) insert into tbl_cliente values....
		//en jpa es persist...
		em.persist(cliente);
		//confirmamos 
		em.getTransaction().commit();
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}finally{
		//cerramos
		em.close();
		}
	} //fin del metodo....

	public void ActualizarCliente(TblCliente cliente) {
		//nos conectamos con la unidad de persist....
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMysqlMiercoles");
				//para administrar la entidades
				EntityManager em=emf.createEntityManager();
				try{
				//iniciar transaccion
				em.getTransaction().begin();
				//invocamos al metodo registrar
			     //actualizar....
				em.merge(cliente);
				//confirmamos 
				em.getTransaction().commit();
				}catch(RuntimeException e){
					System.out.println(e.getMessage());
				}finally{
				//cerramos
				em.close();
				}
		
	} //fin del metodo...

	public void EliminarCliente(TblCliente cliente) {
		//nos conectamos con la unidad de persist....
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMysqlMiercoles");
		//para administrar la entidades
		EntityManager em=emf.createEntityManager();
		try{
			//iniciamos la transaccion...
			em.getTransaction().begin();
			//recuperamos el codigo a eliminar
			TblCliente codelim=em.find(TblCliente.class,cliente.getIdcliente());
			//aplicamos una condicion
			if(codelim!=null){
				//procedemos a eliminar...
				em.remove(codelim);
				//confirmamos
				em.getTransaction().commit();
			}  //fin de la condicion....
		}catch(RuntimeException ex){
			System.out.println(ex.getMessage());
		}finally{
			//cerramos
			em.close();
		}//fin del finally
		
	}//fin del metodo...

	public List<TblCliente> ListadoCliente() {
		// TODO Auto-generated method stub
		return null;
	} //fin del metodo list...

	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}//fin del metodo.....

}//fin de la clase....
