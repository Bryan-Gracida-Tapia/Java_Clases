package ConectionsDB;
import java.sql.*;

/**
 *
 * @author ryangt
 */
public class QueriesDB {
    public void insert(){
        String sql = "Insert into datos_personales(nombre,apellido,curp,fecha_nacimiento) values (?,?,?,?)";
        try{
            Connection con = ConectionDB.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Ryan");
            ps.setString(2, "Gracida");
            ps.setString(3, "GATB041001HCRPR3");
            ps.setString(4, "2004-10-1");
            
            ps.executeUpdate();
            System.out.println("Insercion exitosa");
        } catch(SQLException e){
            e.printStackTrace();
        }       
    }
    
    public void ReadData(){
        String sql = "select * from datos_personales";
        try{
            Connection con = ConectionDB.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            System.out.println("Seleccionado");
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String curp = rs.getString("curp");
                Date nac = rs.getDate("fecha_nacimiento");
            
                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("apellido: " + apellido);
                System.out.println("curp: " + curp);
                System.out.println("fecha nacimiento: " + nac);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
        public void UpdateData(){
        String sql = "update datos_personales set nombre = ? where id = ?";
        try{
            Connection con = ConectionDB.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Bryan");
            
            ps.setInt(2, 1);
            ps.executeUpdate();
            System.out.println("Dato actualizado");
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
        
        public void DeleteData(){
        String sql = "delete from datos_personales where id = ?";
        try{
            Connection con = ConectionDB.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, 1);
            ps.executeUpdate();
            System.out.println("Dato Eliminado");
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
