/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.dao.*;
import Modelo.vo.*;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author SKAPHE
 */
public class ReportesController {
    private LiderDao liderDao;
    private ProyectosDao proyectosDao;
    private ProveedoresDao proveedoresDao;
    
    public ReportesController(){
        liderDao = new LiderDao();
        proyectosDao = new ProyectosDao();
        proveedoresDao = new ProveedoresDao();
    }
    
    public List <LiderVo> listarLideres() throws SQLException{
        return liderDao.listar();
    }
    
   public List <ProyectosVo> listarProyectos() throws SQLException{
        return proyectosDao.listar();
    }
   public List <ProveedoresVo> listarProveedores() throws SQLException{
        return proveedoresDao.listar();
    }
}
