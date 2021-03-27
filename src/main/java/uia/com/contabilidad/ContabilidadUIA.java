package main.java.uia.com.contabilidad;

import java.util.ArrayList;

import main.java.uia.com.contabilidad.clientes.InfoUIA;
import main.java.uia.com.contabilidad.gestor.DecoradorProveedores;
import main.java.uia.com.contabilidad.gestor.Gestor;
import main.java.uia.com.contabilidad.proveedores.Proveedor;
import main.java.uia.com.presentacion.ClienteJSP;

public class ContabilidadUIA {
		
	    public Gestor contabilidad =  null;
		public DecoradorProveedores gestorProveedores = null;		
		public ArrayList<ClienteJSP> ListaProveedores = null;
		public ArrayList<ClienteJSP> ListaCuentas = null;
		public ArrayList<ClienteJSP> ListaCompras = null;
		public ArrayList<ClienteJSP> ListaCheques = null;
		public Proveedor proveedor = null;
		public String clienteId="";

		public ContabilidadUIA()
		{
		 contabilidad = new Gestor("C:\\TSU-UIA\\2021-P\\GitHubWeb\\ContabilidadUIA-web\\ListaProveedores.json");		
		 gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
		 gestorProveedores.Print();
		 ListaProveedores = gestorProveedores.getLista();
		}
		
		
		public ArrayList<ClienteJSP> getListaProveedores(String clienteName) {
			return ListaProveedores;
		}

		public ArrayList<ClienteJSP> getListaProveedores() {
			return ListaProveedores;
		}


		public void setListaProveedores(ArrayList<ClienteJSP> listaProveedores) {
			this.ListaProveedores = listaProveedores;
		}


		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}

		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}


		public ClienteJSP getClienteById(String clienteId) {
			// TODO Auto-generated method stub
			return null;
		}


		public void borraCliente(String clienteId) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<ClienteJSP> getAllClientes() {
			// TODO Auto-generated method stub
			return null;
		}


		public void checkCliente(ClienteJSP cliente) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<ClienteJSP> getCuentas(String clienteName) 
		{
			this.ListaCuentas = proveedor.getListaCuentas();
			return this.ListaCuentas;
		}


		public ArrayList<ClienteJSP> getCompras(String clienteId) {
			this.clienteId = clienteId;
			proveedor = (Proveedor) this.gestorProveedores.busca(clienteId);
			ListaCompras = proveedor.getLista();
			this.getCuentas(clienteId);
			return ListaCompras;
		}

		public ArrayList<ClienteJSP> getListaCompras(String clienteId) {
			this.clienteId = clienteId;
			getCompras(this.clienteId);
			return ListaCompras;
		}

		public ArrayList<ClienteJSP> getListaCompras() {
			return ListaCompras;
		}
		
		
		public ArrayList<ClienteJSP> getCheques(String clienteId) {
			this.clienteId = clienteId;
			proveedor = (Proveedor) this.gestorProveedores.busca(clienteId);
			ListaCompras = proveedor.getLista();
			this.getCuentas(clienteId);
			return ListaCheques;
		}
		
		public ArrayList<ClienteJSP> getListaCheques(String clienteId) {
			this.clienteId = clienteId;
			getCheques(this.clienteId);
			return ListaCheques;
		}
		
		public ArrayList<ClienteJSP> getListaCheques() {
			return ListaCheques;
		}
		
		
		public ArrayList<ClienteJSP> getListaCuentas() {
			return ListaCuentas;
		}
		
}
