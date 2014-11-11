package dao;

import org.h2.jdbc.JdbcSQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2DaoFactory implements DaoFactory {

    private String user = "sa";
    private String password = "sa";
    private String url = "jdbc:h2:tcp://localhost/~/bookstore";
    private String driver = "org.h2.Driver";

    public H2DaoFactory() throws java.net.ConnectException {
        try {
            Class.forName(driver);
        } catch (NullPointerException a) {
            System.err.println("Driver not found");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found");
        }

        try {
            DriverManager.getConnection(url, user, password);
        } catch (JdbcSQLException ad) {
            System.err.println("Not connection");
        } catch (SQLException e) {
            System.err.println("Not connection");
        }
    }

    public Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (JdbcSQLException ad) {
            System.err.println("Database is not connected");
        } catch (SQLException e) {
            System.err.println("Database is not connected");
        }
        return null;
    }

    @Override
    public AuthorDao getAuthorDao(Connection connection) {
        return null;
    }
}