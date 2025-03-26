import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Connection conexion = DatabaseConnection.getConnection();
            //Inserto nuevo actor
            String insert="insert into actor (first_name,last_name) values (?,?)";
            PreparedStatement stmInsert=conexion.prepareStatement(insert);
            stmInsert.setString(1,"Pepito");
            stmInsert.setString(2,"Perez");
            System.out.println(stmInsert.executeUpdate());

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