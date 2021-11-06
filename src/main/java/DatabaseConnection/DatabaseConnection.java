package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL="jdbc:mysql://localhost:3306/";
    private static final String USERNAME="root";
    private static final String PASSWORD ="admin";
    private static final String DBNAME="student";
    private static final String DRIVERNAME="com.mysql.cj.jdbc.Driver";

    public static Connection getConnetion() throws SQLException,ClassNotFoundException{
        Class.forName(DRIVERNAME);
        return DriverManager.getConnection(URL+DBNAME,USERNAME,PASSWORD);

    }
    public static void closeConnection(Connection connection) {
        try {
            if(connection !=null & !connection.isClosed()) {
                connection.close();
            }
        }catch(SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void closeAll(PreparedStatement ps) {
        try {
            if(ps !=null && !ps.isClosed()) {
                ps.close();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
