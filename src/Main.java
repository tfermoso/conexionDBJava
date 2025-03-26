import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Connection conexion = DatabaseConnection.getConnection();
            String sql="select * from actor";
            PreparedStatement stm =conexion.prepareStatement(sql);
            ResultSet resultSet=stm.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}