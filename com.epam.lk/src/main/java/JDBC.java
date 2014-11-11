import java.sql.*;

public class JDBC {
    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    String url = "jdbc:h2:tcp://localhost/~/bookstore";
    String user = "sa";
    String password = "sa";

    public void doConnect() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();


    }

    public void dropTable() throws SQLException {
        statement.executeUpdate("DROP TABLE Joke");
        statement.close();
    }

    public void createTable() throws SQLException {
        statement.executeUpdate("CREATE Table Joke(lol smallint )");
        statement.close();
    }

    public void insertTableEmployee() throws SQLException {
        String insItem = "INSERT INTO EMPLOYEE (EMPLOYEE_ID,EMPLOYEE_NAME) \n VALUES (67,'uu')";
        statement.executeUpdate(insItem);
        resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
        while (resultSet.next()) {
            System.out.println("Item: " + resultSet.getString("employee_name"));

        }
        resultSet.close();
    }

    public void connectionClose() throws SQLException {
        connection.close();
    }


}


//
//           String dropTable = "DROP TABLE todoList";
//            statement.executeUpdate(dropTable);

//        String createTable = "CREATE TABLE todoList (item varchar(20));";
//        statement.executeUpdate(createTable);
//String insItem = "INSERT INTO EMPLOYEE (EMPLOYEE_ID,EMPLOYEE_NAME) VALUES (10,'Petr');";
//statement.executeUpdate(insItem);
//        resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
//        while (resultSet.next()) {
//            System.out.println("Item: " + resultSet.getString("employee_name"));
//        }
//        resultSet.close();
