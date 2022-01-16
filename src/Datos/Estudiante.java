
package Datos;

import ConexionSQL.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author IE TECNICO SUPERIOR
 */
public class Estudiante {
    
    //guardamos en una variable en codigo sql a ejecutar para agrear un estudiante
private final String SQL_INSERT = "INSERT INTO estudiantes (ApellidoNombre,IDSalón,CodigoEstudiante,Estado) Values (?,?,?,?)";


private PreparedStatement PS;
private conexion CN;
ResultSet rs;
public Estudiante(){
PS=null;
CN= new conexion();
}




public int InsertarDatos(String ApellidoNombre,int Salon,int CodigoEstudiante){ //meteodo para insertar que pide los datos
    
    try{
        
        PS= CN.getConnection().prepareStatement(SQL_INSERT); //se ejecuta el codigo que guarmaos en la variable
        PS.setString(1, ApellidoNombre); //se remplazan los "?" por los datos ingresados en el metodo
        PS.setInt(2, Salon);
        PS.setInt(3, CodigoEstudiante);
        PS.setInt(4, 0);
        int res =    PS.executeUpdate();
        if(res>0){ JOptionPane.showMessageDialog(null,"Registros Guardados: "+ res);
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
public int ActualizarDatos (String id,String ApellidoNombre,int Salon,int CodigoEstudiante){
    
    String SQL = "UPDATE estudiantes SET ApellidoNombre='"+ApellidoNombre+"',IDSalón='"+Salon+"',CodigoEstudiante='"+CodigoEstudiante+"'WHERE IDEstudiante="+id;
     
    try{
        PS= CN.getConnection().prepareStatement(SQL);
        
        int res =   PS.executeUpdate();
        if (res>0){ JOptionPane.showMessageDialog(null,"Resgistros modificados: "+res);
            
        }
        
    }
    catch(Exception e){
        System.err.println("Error al actualizar los datos en la db: "+e.getMessage() );
    }finally{
        PS=null;
        CN.desconectar();
            }
        
     
    
    
    
    return 0;
}
public int ObtenerDatos(String id){ //se obtiene los dtos a traves ddel id
    
    try{
        PS= CN.getConnection().prepareStatement("SELECT * FROM estudiantes WHERE IDEstudiante = ?");
        PS.setString(1, id);
        
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
public int obtenerIntInfo(String datoI){ //metodo para obtener informacion
    
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


public int EliminarDatos (String id){ //se obtiene el id del estudiante
    String SQL = "DELETE from estudiantes WHERE IdEstudiante="+id; //se ejecuta la orden de eliminar 
try{
        
        PS= CN.getConnection().prepareStatement(SQL);

        int res =    PS.executeUpdate();
        if(res>0){ JOptionPane.showMessageDialog(null,"Registros Eliminados: ");
            }
    }
    catch(Exception e){
    
    System.err.println("Error al Eliminar  los datos en la db: "+e.getMessage() );
    }finally{
        PS=null;
        CN.desconectar();
            }
    return 0;


}




}
