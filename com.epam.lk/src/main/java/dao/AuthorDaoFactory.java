package dao;

import entity.bookstore.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDaoFactory implements AuthorDao {
    private final Connection connection;
    List<Author> authorList = new ArrayList<Author>();
    public AuthorDaoFactory(Connection connection) {
        this.connection = connection;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    @Override
    public Author create() {
        return null;
    }

    @Override
    public Author read(int key) throws SQLException {
        String sql = "SELECT * FROM Author WHERE id = ?;";
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setInt(1, key);

        ResultSet rs = stm.executeQuery();
        rs.next();
        Author g = new Author();
        g.setAuthorId(rs.getInt("author_id"));
        g.setAuthorName(rs.getString("author_name"));
        System.out.println(g);
        return g;
    }

    @Override
    public void update(Author author) {

    }

    @Override
    public void deleteAuthor(int id) throws SQLException {

        try (PreparedStatement statement = connection.prepareStatement("DELETE FROM AUTHOR WHERE AUTHOR_ID=?")) {
            //  statement.setInt(1,id);
            connection.prepareStatement("CREATE TRIGGER INV_DEL " +
                    "AFTER DELETE ON AUTHOR FOR EACH ROW " +
                    "CALL \"org.h2.samples.TriggerSample$AuthorTrigger\" ");
            statement.setInt(1, id);
            statement.executeUpdate();
        }

    }

    @Override
    public void insertAuthor(String Jk) throws SQLException {

        String insertNewAuthor = "INSERT INTO AUTHOR (AUTHOR_NAME)" + "VALUES(?)";
        try (PreparedStatement statement = connection.prepareStatement(insertNewAuthor)) {
            statement.setString(1, Jk);
            statement.executeUpdate();
            System.out.println("Your Query is: "+insertNewAuthor);
        } catch (SQLException e) {
            System.err.println("Impossible operation");
        }
        catch (NullPointerException se) {
            System.err.println("Try again");
        }
            }

    @Override
    public List<Author> getAll() throws SQLException {
        String selectAll = "SELECT * FROM Author;";

        try (PreparedStatement stm = connection.prepareStatement(selectAll)) {
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Author g = new Author();
                g.setAuthorId(rs.getInt("AUTHOR_ID"));
                g.setAuthorName((rs.getString("AUTHOR_NAME")));
                authorList.add(g);

            }
        } catch (SQLException sql) {
            System.err.println("Impossible operation");
        } finally {

          //  System.out.println(authorList);


             }
        return authorList;

    }
}
