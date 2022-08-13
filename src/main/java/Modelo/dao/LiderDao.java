/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dao;

import Modelo.vo.LiderVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import util.JDBCUtilities;

/**
 *
 * @author SKAPHE
 */
public class LiderDao {
    
     public List<LiderVo> listar()throws SQLException {
        LinkedList<LiderVo> respuesta = new LinkedList<LiderVo>();
        
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;      
                
        
        String sql = " SELECT l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Ciudad_Residencia " +
                " FROM Lider l " +
                " ORDER BY l.Ciudad_Residencia ASC; ";
        /**String sql = " SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia ASC; ";**/
                
        try{
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                LiderVo liderVo = new LiderVo();
                
                liderVo.setID(rs.getString("ID_Lider"));
                liderVo.setNombre(rs.getString("Nombre"));
                liderVo.setPrimer_Apellido(rs.getString("Primer_Apellido"));
                liderVo.setCiudad(rs.getString("Ciudad_Residencia"));               
                
                
                respuesta.add(liderVo);
                
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
