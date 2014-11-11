package dao;

import entity.bookstore.Authors;

import java.sql.SQLException;
import java.util.List;

public interface AuthorsDao {
    public Authors create();

    public Authors read(int key) throws SQLException;

    public void update(Authors authors);

    public void delete(Authors authors);

    public List<Authors> getAll() throws SQLException;
}
