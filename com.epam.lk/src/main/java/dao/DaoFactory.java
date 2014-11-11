package dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DaoFactory {


    public Connection getConnection() throws SQLException;

    AuthorDao getAuthorDao(Connection connection);

}