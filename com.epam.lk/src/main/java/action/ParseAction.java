package action;

import javax.servlet.http.HttpServletRequest;

public class ParseAction implements Action{


    @Override
    public String execute(HttpServletRequest request) {
        String text = request.getParameter("text");
        request.setAttribute("text",text);
        return "/WEB-INF/result.jsp";
    }
}
