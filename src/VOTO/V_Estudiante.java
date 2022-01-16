package VOTO;




import ConexionSQL.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class V_Estudiante {

    
private PreparedStatement PS;
private conexion CN;
ResultSet rs;
public V_Estudiante(){
PS=null;
CN= new conexion();  
} 
public String Ide;
    
    
    
public int ObtenerDatos(String IDSALON, int Codigo){ //metodo para obtener datos nos pide el id del salon y su codigo
    
    try{
        PS= CN.getConnection().prepareStatement("SELECT * FROM estudiantes WHERE IDSalón = ? AND  CodigoEstudiante= ?");//se hace la consulta utilizando el signo ? como variable
        PS.setString(2, IDSALON); //se le pasaa info de la variable a los "?"
        PS.setInt(1, Codigo);

       rs = PS.executeQuery(); //se ejecuta la consulta
        
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

public String obtenerTextInfo(String datoT){ //obtener textos
    
 
    
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
public int ActualizarDatos (String id,String Estado){ //actualiza el estado del estudiante utilizando su id y su estado
    
    String SQL = "UPDATE estudiantes SET Estado='"+Estado+"'WHERE IDEstudiante ="+id; //orden que se ejecuta
     
    try{
        PS= CN.getConnection().prepareStatement(SQL); //ejectua la orden
        
        int res =   PS.executeUpdate();
        if (res>0){ 
            System.out.println("Resgistros modificados: "+res);
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
public  void SelectIdEstudiante (String Id){
    
    Ide= Id;
    System.out.println("ID1= "+Ide);

}
public String  GetEstudiante (){
        System.out.println("ID2= "+Ide);

    return Ide;

}

public int Voto(String IDEstudiante,String IDCandidato){ //crea un nuevo registro en la tabla votos utilizando el id del candidato y el id del estudiante
    
    try{
        
        PS= CN.getConnection().prepareStatement("INSERT INTO `votos` (`IDVoto`, `IDEstudiante`, `IDCandidato`) VALUES (NULL,?,?);"); //orden 
        PS.setString(1, IDEstudiante); //remplaza los "?"
        PS.setString(2, IDCandidato);

        int res =    PS.executeUpdate(); //ejecurta a accion
        if(res>0){ 
            System.out.println("Registros Guardados: "+ res);
            
            
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
        if (res>0){ System.out.println("Registros Modificados: "+ res);
            
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


}



