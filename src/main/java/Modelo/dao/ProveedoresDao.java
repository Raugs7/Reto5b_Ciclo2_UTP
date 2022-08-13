/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dao;


import Modelo.vo.ProveedoresVo;
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
public class ProveedoresDao {
    public List<ProveedoresVo> listar()throws SQLException {
        LinkedList<ProveedoresVo> respuesta = new LinkedList<ProveedoresVo>();
        
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;      
                
        
        String sql = " SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado " +
                " FROM Proyecto p " +
                " JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto " +
                " WHERE c.Proveedor = 'Homecenter' " +
                " AND p.Ciudad = 'Salento'; ";
                
        try{
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                ProveedoresVo proveedoresVo = new ProveedoresVo();
                
                proveedoresVo.setID_compra(rs.getString("ID_Compra"));
                proveedoresVo.setConstructora(rs.getString("Constructora"));
                proveedoresVo.setBanco_vinculado(rs.getString("Banco_Vinculado"));              
                
                
                respuesta.add(proveedoresVo);
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
