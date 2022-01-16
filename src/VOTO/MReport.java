/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VOTO;

import ConexionSQL.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class MReport {
private PreparedStatement PS;
private conexion CN;
ResultSet rs;

public MReport(){
PS=null;
CN= new conexion();  
} 
//el sigueinte codigo está en proceso y no es utilizzado en el software
public int contarVotos(int IDCandidato){
 String SQL = " select count(*) AS rowcount from votos where IDCandidato="+IDCandidato;
 int numvotos=0;   
 try{
        PS= CN.getConnection().prepareStatement(SQL);
         rs = PS.executeQuery();
         numvotos= rs.getInt("rowcount"); // busca el valor que nos devuelve la secuencia
         rs.next();
           
            
           
            
    }
    catch(SQLException e){
    
    System.err.println("Error al Guardar los datos en la db: "+e.getMessage() );
    }finally{
        PS=null;
        CN.desconectar();
            }

return numvotos; //lo envia
}
//metodo que se utiliza en el software actulmente
public int CONTARVOTOS (int IDCandidato){
    
    try{
        PS= CN.getConnection().prepareStatement("SELECT COUNT(*) AS rowcount FROM votos WHERE IDCandidato="+IDCandidato);

       rs = PS.executeQuery();
        
       if(rs.next()){
           
            }
    }
    catch(Exception e){
    
    System.err.println("Error al Guardar los datos en la db: "+e.getMessage() );
    }finally{
        PS=null;
        CN.desconectar();
            }
    
return 0;




}
public int obtenerIntInfo(String datoI){
    
    int Datoint = 0;
    
    try {
        if (rs.getInt(datoI)>0){
           Datoint= rs.getInt(datoI);
        } else {JOptionPane.showMessageDialog(null, "no hay info en campo: "+datoI);
        }
      
        
    } catch (Exception e) {
     System.err.println("No se encontró ese dato "+e.getMessage() );

    }
   
    
 return Datoint; 



}
public int candidatos (int IDCandidato){ //trae la informacion d los candidatos
    
     try{
        PS= CN.getConnection().prepareStatement("SELECT * FROM `candidatos` WHERE IDCandidato ="+IDCandidato);

       rs = PS.executeQuery();
        
       if(rs.next()){
           
            }
    }
    catch(SQLException e){
    
    System.err.println("Error al Guardar los datos en la db: "+e.getMessage() );
    }finally{
        PS=null;
        CN.desconectar();
            }
    
    
    return 0;

}
public String obtenerTextInfo(String datoT){
    
 
    
 String Sdato=null;
    try {
        Sdato= rs.getString(datoT);
        if (Sdato!=null) {
           
        }else{JOptionPane.showMessageDialog(null, "no hay info en el campo: "+ datoT);}
        
        
    } catch (Exception e) {
     
    JOptionPane.showMessageDialog(null, "no se ha encontrado ningún resultado");
    System.err.println("No se encontró ese dato "+e.getMessage() );

    }
    
 return Sdato; 
}
}
