package ConectionsDB;
import java.sql.*;

/**
 *
 * @author ryangt
 */
public class ConectionDB {
    
    private static final String URL = "jdbc:mysql://localhost:3306/alumnos?useSSL=false&serverTimezone=UTC";
    private static final String USER = "javauser";
    private static final String PASS = "java123";


    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver MySQL no encontrado");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos");
            e.printStackTrace();
        }
        return con;
    }
    
    
}
