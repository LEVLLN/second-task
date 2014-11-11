import dao.AuthorDao;
import dao.AuthorDaoFactory;
import dao.DaoFactory;
import dao.H2DaoFactory;
import entity.bookstore.Author;

import java.rmi.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws SQLException, ConnectException, java.net.ConnectException {
        DaoFactory daoFactory = new H2DaoFactory();


        String n = "√Œ√ŒÀ‹";

        try (Connection con = daoFactory.getConnection()) {

            AuthorDao dao = new AuthorDaoFactory(con);
            //dao.insertAuthor(n);
            dao.getAll();
            List<Author> list = dao.getAll();
            System.out.println(list);
            //  dao.deleteAuthor();


        }

    }
}