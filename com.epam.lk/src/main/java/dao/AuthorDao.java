package dao;

import entity.bookstore.Author;

import java.sql.SQLException;
import java.util.List;

public interface AuthorDao {
    public Author create();

    public Author read(int key) throws SQLException;

    public void update(Author author);

    public void deleteAuthor(int id) throws SQLException;

    void insertAuthor(String Jk) throws SQLException;

    public List<Author> getAll() throws SQLException;
}
