package shop.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
package.

public class DatabaseConnection {
    public static Connection getConnection(){
        return connection;
    }
    public static boolean connect(){
        try{
            this.connection = DriverManager.getConnection("jdbc:sqlite:shop_data.db");
        } catch (SQLException exception){
            exception.printStackTrace();
        }
        return true;
    }

    public static boolean disconnect(){
        try{
            this.connection.close();
        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    private static Connection connection;
}
