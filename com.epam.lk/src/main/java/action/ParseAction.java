package action;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseAction implements Action{


    @Override
    public String execute(HttpServletRequest request) {
        String text = request.getParameter("text");

              request.setAttribute("text",text);
        return "/WEB-INF/result.jsp";
    }
}
