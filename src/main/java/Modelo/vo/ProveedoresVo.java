/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.vo;

/**
 *
 * @author SKAPHE
 */
public class ProveedoresVo {
    private Integer ID_compra;
    private String constructora;
    private String banco_vinculado;

    /**
     * @return the ID_compra
     */
    public Integer getID_compra() {
        return ID_compra;
    }

    /**
     * @param ID_compra the ID_compra to set
     */
    public void setID_compra(Integer ID_compra) {
        this.ID_compra = ID_compra;
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
     * @return the banco_vinculado
     */
    public String getBanco_vinculado() {
        return banco_vinculado;
    }

    /**
     * @param banco_vinculado the banco_vinculado to set
     */
    public void setBanco_vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }
    
    @Override
    public String toString(){
        
        return String.format("%3d %-25s %-25s", this.ID_compra, this.constructora, this.banco_vinculado); 
        
    }
}
