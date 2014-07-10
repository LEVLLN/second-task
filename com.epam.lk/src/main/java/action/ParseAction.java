package action;

import entity.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseAction implements Action{


    @Override
    public String execute(HttpServletRequest request) {
       String text = request.getParameter("text");

        text = request.getParameter("text");
        Text d = Parser.parseText(text); //run Great-Parsing-Machine




        request.setAttribute("text", d);
        request.setAttribute("paragraph", d.Components());

        //return view
        return "WEB-INF/result.jsp";
    }
}
