package triggers;

import org.h2.api.Trigger;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorTrigger implements Trigger {
    @Override
    public void init(Connection connection, String s, String s2, String s3, boolean b, int i) throws SQLException {

    }

    @Override
    public void fire(Connection connection, Object[] oldRow, Object[] newRow) throws SQLException {
        BigDecimal diff = null;
        if (newRow != null) {
            diff = (BigDecimal) newRow[1];
        }
        if (oldRow != null) {
            BigDecimal m = (BigDecimal) oldRow[1];
            diff = diff == null ? m.negate() : diff.subtract(m);
        }
        PreparedStatement prep = connection.prepareStatement(
                "DELETE AUTHORS");
        prep.setBigDecimal(1, diff);
        prep.execute();
    }

    @Override
    public void close() throws SQLException {

    }

    @Override
    public void remove() throws SQLException {

    }
}
