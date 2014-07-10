package action;

import entity.Parser;
import entity.Text;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseAction implements Action{


    @Override
    public String execute(HttpServletRequest request) {
       String text = request.getParameter("text");

        Text result = (Text) Parser.parseParagraphs(text);

       request.setAttribute("text", result);
        return "/WEB-INF/result.jsp";
    }
}
