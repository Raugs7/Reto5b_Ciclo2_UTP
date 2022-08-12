/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dao;

import Modelo.vo.ProyectosVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;

/**
 *
 * @author SKAPHE
 */
public class ProyectosDao {
    public List<ProyectosVo> listar()throws SQLException {
        ArrayList<ProyectosVo> respuesta = new ArrayList<ProyectosVo>();
        
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;      
                
        
        String sql = " SELECT p.ID_Proyecto, p.Constructora, p.Numero_Habitaciones, p.Ciudad " +
                " FROM Proyecto p " +
                " WHERE p.Clasificacion = 'Casa Campestre' " +
                " AND p.Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla' ); ";
                
        try{
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                ProyectosVo proyectosVo = new ProyectosVo();
                
                proyectosVo.setID_Proyecto(rs.getInt("ID_Proyecto"));
                proyectosVo.setConstructora(rs.getString("Constructora"));
                proyectosVo.setNumero_Habitaciones(rs.getInt("Numero_Habitaciones"));
                proyectosVo.setCiudad(rs.getString("Ciudad"));               
                
                
                respuesta.add(proyectosVo);
            }
        }
        finally {
            if(rs != null){
                rs.close();
            }
            if(stmt != null){
                stmt.close();
            }
            if (conn != null){
                conn.close();
            }
        
        }      
                         
        return respuesta;
    }
}
