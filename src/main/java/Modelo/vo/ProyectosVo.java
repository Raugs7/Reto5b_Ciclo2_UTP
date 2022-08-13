/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.vo;

/**
 *
 * @author SKAPHE
 */
public class ProyectosVo {
    private String ID_Proyecto;
    private String constructora;
    private String numero_Habitaciones;
    private String ciudad;

    /**
     * @return the ID_Proyecto
     */
    public String getID_Proyecto() {
        return ID_Proyecto;
    }

    /**
     * @param ID_Proyecto the ID_Proyecto to set
     */
    public void setID_Proyecto(String ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }

    /**
     * @return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return the numero_Habitaciones
     */
    public String getNumero_Habitaciones() {
        return numero_Habitaciones;
    }

    /**
     * @param numero_Habitaciones the numero_Habitaciones to set
     */
    public void setNumero_Habitaciones(String numero_Habitaciones) {
        this.numero_Habitaciones = numero_Habitaciones;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString(){
        
        return String.format("%-3s %-25s %-7s %-25s", this.ID_Proyecto, this.constructora, this.numero_Habitaciones, this.ciudad); 
        
    }
}
