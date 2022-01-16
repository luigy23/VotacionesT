
package Datos;

import ConexionSQL.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author IE TECNICO SUPERIOR
 */
public class jornadas {
private final String SQL_INSERT = "INSERT INTO jornada (Descripción) Values (?)";


private PreparedStatement PS;
private conexion CN;
ResultSet rs;
public jornadas(){
PS=null;
CN= new conexion();
}




public int InsertarDatos(String Nombre){
    
    try{
        
        PS= CN.getConnection().prepareStatement(SQL_INSERT);
        PS.setString(1, Nombre);

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
public int ActualizarDatos (String id,String Nombre,String Apellido,int Salon,int CodigoEstudiante){
    
    String SQL = "UPDATE estudiantes SET Nombre='"+Nombre+"',Apellido='"+Apellido+"',ID Salón='"+Salon+"',CodigoEstudiante='"+CodigoEstudiante+"'WHERE id"+id;
     
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
public int ObtenerDatos(String id){
    
    try{
        PS= CN.getConnection().prepareStatement("SELECT * FROM estudiantes WHERE IDEstudiantes = ?");
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
public int obtenerIntInfo(int datoI){
    
    int Idato=0;
    try {
        if (Idato>0){
        Idato= rs.getInt(datoI);
        } else {JOptionPane.showMessageDialog(null, "no hay info en campo: "+datoI);
        }
        
        
    } catch (Exception e) {
     System.err.println("No se encontró ese dato "+e.getMessage() );

    }
   
    
 return Idato; 



}


public int EliminarDatos (String id){
    String SQL = "DELETE from estudiantes WHERE IdEstudiantes="+id;
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
