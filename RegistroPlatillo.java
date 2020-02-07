/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controladores;

import com.dominio.Platillos;
import com.dominio.PlatillosFacade;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author ALFA-AS3-1A6600
 */
@Named(value = "registroPlatillo")
@Dependent
public class RegistroPlatillo {
    
    private String nombrePlatillo;
    private float costo;
    private float peso;
    private String tiempoDePreparacion;
    private long id;
    
    @Inject
    private PlatillosFacade registroPlatilloFacade;

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTiempoDePreparacion() {
        return tiempoDePreparacion;
    }

    public void setTiempoDePreparacion(String tiempoDePreparacion) {
        this.tiempoDePreparacion = tiempoDePreparacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * Creates a new instance of RegistroPlatillo
     */
    public RegistroPlatillo() {
    }
    
    public String guarduar(){
        Platillos p = new Platillos();
        p.setNombrePlatillo(nombrePlatillo);
        p.setCosto(costo);
        p.setPeso(peso);
        p.setTiempoDePreparacion(tiempoDePreparacion);
        this.registroPlatilloFacade.create(p);
        this.id = p.getId();
        return "Pedidos";
    }
    
    /*public List<Platillos> getPlatillos(){
        return this.registroPlatilloFacade.findAll();
    }
    
    public String prepareList(){
        return "Pedidos";
    }*/
    
    /*public String prepareCreate(){
        return "PedidosCreate";
    }
    
    public String Eliminar(Long id){
        Platillos p = this.registroPlatilloFacade.find(id);
        this.registroPlatilloFacade.remove(p);
        return "Pedidos";
    }
    
    public String Editar(Long id){
        Platillos p = this.registroPlatilloFacade.find(id);
        this.id = p.getId();
        this.nombrePlatillo = p.getNombrePlatillo();
        this.costo = p.getCosto();
        this.peso = p.getPeso();
        this.tiempoDePreparacion = p.getTiempoDePreparacion();
        return "PedidosEdit";
    }
    
    public String GuardarEdicion(RegistroPlatillo bp, Long id){
        Platillos p = new Platillos();
        p.setId(id);
        p.setNombrePlatillo(bp.nombrePlatillo);
        p.setCosto(bp.costo);
        p.setPeso(bp.peso);
        p.setTiempoDePreparacion(bp.tiempoDePreparacion);
        this.registroPlatilloFacade.edit(p);
        return "Pedidos";
    }*/
}
