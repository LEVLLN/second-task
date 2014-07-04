package action;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseAction implements Action{


    @Override
    public String execute(HttpServletRequest request) {
        String text = request.getParameter("text");
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(text);

        request.setAttribute("text",matcher.group(text));
        return "/WEB-INF/result.jsp";
    }
}
