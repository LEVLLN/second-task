package action;

import javax.servlet.http.HttpServletRequest;
import java.net.ConnectException;

public interface Action {
    String execute(HttpServletRequest request) throws ConnectException;
}

