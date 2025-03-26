import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila"; // Cambia por tu DB
        String usuario = "root"; // O tu usuario
        String contraseña = ""; // O tu pass

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            System.out.println("✅ Conexión exitosa a MySQL");
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar a MySQL");
            e.printStackTrace();
        }
    }
}
