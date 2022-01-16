package Datos;




import ConexionSQL.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Salon {

    
private PreparedStatement PS;   //donde se pone la orden a ejecutar
private conexion CN; //objeto conexion
ResultSet rs;  //variable donde de guardan los datos sql
public Salon(){
PS=null;
CN= new conexion();  //inicia la conexcion la base de datos
} 
    public int ObtenerSalon(int IDSALON){
    
    try{
        PS= CN.getConnection().prepareStatement("SELECT * FROM salon WHERE IDSalón = "+IDSALON);
        

       rs = PS.executeQuery();
        
       if(rs.next()){
           
            }
    }
    catch(Exception e){
    
    System.err.println("Error al obtener los datos salon en la db: "+e.getMessage() );
    }finally{
        PS=null;
        CN.desconectar();
            }
return 0;
}
    
public String obtenerTextInfo(String datoT){ //metodo para obtener texto (pide el nombre de columna)
    
 
    
 String Sdato=null; //resultado se inicia en nulo
    try {
        Sdato= rs.getString(datoT); //se saca la info del rs
        if (Sdato!=null) {
           
        }else{JOptionPane.showMessageDialog(null, "no hay info en el campo: "+ datoT);}
        
        
    } catch (Exception e) {
     
    JOptionPane.showMessageDialog(null, "no se ha encontrado ningún resultado");
    System.err.println("No se encontró ese dato "+e.getMessage() );

    }
    
 return Sdato;  //devuelve la info
}
}
