package action;

import javax.servlet.http.HttpServletRequest;
import java.net.ConnectException;

public class ParseAction implements Action{


    @Override
    public String execute(HttpServletRequest request) throws ConnectException {
        String text = request.getParameter("text");

        text = request.getParameter("text");
        request.setAttribute("text", text);


        return "WEB-INF/result.jsp";
    }


}
