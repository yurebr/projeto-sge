/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelBean.Area;

/**
 *
 * @author Senai
 */
public class AreaDao {
    
    public List<Area> ListarArea(){
        List<Area> listaArea = new ArrayList();
        
        try{
        Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("select * from area");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Area areaAtual = new Area();
                
                areaAtual.setId(rs.getInt("id"));
                areaAtual.setNome(rs.getString("nome"));
                
                listaArea.add(areaAtual);
                        
            }
            rs.close();
            stmt.close();
            conexao.close();
        
        } catch(SQLException e){
            e.printStackTrace();
        }
        return listaArea;
    }
}
