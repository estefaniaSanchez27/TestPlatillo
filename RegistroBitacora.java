/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controladores;

import com.dominio.BitacoraDePedidos;
import com.dominio.BitacoraDePedidosFacade;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author ALFA-AS3-1A6600
 */
@Named(value = "registroBitacora")
@Dependent
public class RegistroBitacora {
    private Date fechaDePedido;
    private Time horaDePedido;
    private Long iDPlatillo;
    private Long iDCliente;

    public Long getiDPlatillo() {
        return iDPlatillo;
    }

    public void setiDPlatillo(Long iDPlatillo) {
        this.iDPlatillo = iDPlatillo;
    }

    public Long getiDCliente() {
        return iDCliente;
    }

    public void setiDCliente(Long iDCliente) {
        this.iDCliente = iDCliente;
    }
    private long id;
    
    @Inject
    private BitacoraDePedidosFacade registroBitacorafacade;

    public Date getFechaDePedido() {
        return fechaDePedido;
    }

    public void setFechaDePedido(Date fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    public Time getHoraDePedido() {
        return horaDePedido;
    }

    public void setHoraDePedido(Time horaDePedido) {
        this.horaDePedido = horaDePedido;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String guardar(){
        BitacoraDePedidos bi = new BitacoraDePedidos();
        bi.setFecha(fechaDePedido);
        bi.setHora(horaDePedido);
        bi.setIdPlatillo(iDPlatillo);
        bi.setIdCliente(iDCliente);
        this.registroBitacorafacade.create(bi);
        this.id = bi.getId();
        return "Pedidos";
    }
    
    /*public List<BitacoraDePedidos> getBitacora(){
        return this.registroBitacorafacade.findAll();
    }
    
    public String prepareList(){
        return "Pedidos";
    }*/
    
    /*public String prepareCreate(){
        return "PedidosCreate";
    }
    
    public String Eliminar(Long id){
        BitacoraDePedidos bi = this.registroBitacorafacade.find(id);
        this.registroBitacorafacade.remove(bi);
        return "Pedidos";
    }
    
    public String Editar(Long id){
        BitacoraDePedidos bi = this.registroBitacorafacade.find(id);
        this.id = bi.getId();
        this.iDPlatillo = bi.getIdPlatillo();
        this.iDCliente = bi.getIdCliente();
        this.fechaDePedido = bi.getFecha();
        this.horaDePedido = bi.getHora();
        return "PedidosEdit";
    }
    
    public String GuardarEdicion(RegistroBitacora rbi,Long id){
        BitacoraDePedidos bi = new BitacoraDePedidos();
        bi.setId(id);
        bi.setIdPlatillo(rbi.iDPlatillo);
        bi.setIdCliente(rbi.iDCliente);
        bi.setFecha(rbi.fechaDePedido);
        bi.setHora(rbi.horaDePedido);
        this.registroBitacorafacade.edit(bi);
        return "Pedidos";
    }*/

    /**
     * Creates a new instance of RegistroBitacora
     */
    public RegistroBitacora() {
    }
    
}
