package My_Classes;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "java_library_system";
    private static Integer portNumber = 3306;
    private static String pass = "";

    public static Connection getConnection()
    {
        Connection connection = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(serverName);
        datasource.setUser(userName);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portNumber);
        datasource.setPassword(pass);

        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }
}