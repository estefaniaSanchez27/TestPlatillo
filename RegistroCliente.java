/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controladores;

import com.dominio.Clientes;
import com.dominio.ClientesFacade;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author ALFA-AS3-1A6600
 */
@Named(value = "registroCliente")
@Dependent
public class RegistroCliente {
    
    private String nombreCliente;
    private String correo;
    private String direccion;
    private String tel;
    private long id;
    
    @Inject
    private ClientesFacade registroClientesfacade;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String guardar(){
        Clientes c = new Clientes();
        c.setNombreCliente(nombreCliente);
        c.setCorreo(correo);
        c.setDireccion(direccion);
        c.setTel(tel);
        this.registroClientesfacade.create(c);
        this.id = c.getId();
        return "Pedidos";
    }
    
    /*public List<Clientes> getClientes(){
        return this.registroClientesfacade.findAll();
    }
    
    public String prepareList(){
        return "Pedidos";
    }*/
    
    /*public String prepareCreate(){
        return "Pedidos";
    }
    
    public String Eliminar(Long id){
        Clientes c = this.registroClientesfacade.find(id);
        this.registroClientesfacade.remove(c);
        return "Pedidos";
    }
    
    public String Editar(Long id){
        Clientes c = this.registroClientesfacade.find(id);
        this.id = c.getId();
        this.nombreCliente = c.getNombreCliente();
        this.correo = c.getCorreo();
        this.direccion = c.getDireccion();
        this.tel = c.getTel();
        return "PedidosEdit";
    }
    
    public String GuardarEdicion(RegistroCliente bc, Long id){
        Clientes c = new Clientes();
        c.setId(id);
        c.setNombreCliente(bc.nombreCliente);
        c.setCorreo(bc.correo);
        c.setDireccion(bc.direccion);
        c.setTel(bc.tel);
        this.registroClientesfacade.edit(c);
        return "Pedidos";
    }

    /**
     * Creates a new instance of RegistroCliente
     */
    public RegistroCliente() {
    }
    
}
