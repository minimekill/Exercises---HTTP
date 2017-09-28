
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Leg", urlPatterns = {"/Leg"})
public class Leg extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Leg</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Leg at " + request.getContextPath() + "</h1>");
            
            out.println("<p>Connection: " + request.getHeader("Connection") + "</p>");
            out.println("<p>Host: " + request.getHeader("Host") + "</p>");
            out.println("<p>Cache: " + request.getHeader("Cache-Control") + "</p>");
            out.println("<p>Accept: " + request.getHeader("Accept") + "</p>");
            out.println("<p>UserAgent: " + request.getHeader("User-Agent") + "</p>");
            out.println("<p>Encoding: " + request.getHeader("Accept-Encoding") + "</p>");
            out.println("<p>Language: " + request.getHeader("Accept-Language") + "</p>");
            
//            response.setHeader("Cache-Control", "max-age=300");
//            
//            out.println("<p>Parameter: " + request.getParameter("name") + "</p>");
//            
//            //request.getSession().setAttribute("name", "loooooooooretsessioncokkkeeee");
//            out.println("<p>COKEEEEEE: " + request.getSession().getAttribute("name") + "</p>");
//            
//            response.addCookie(new Cookie("name","denresistentekage"));
//            out.println("<p>COKEEEEEE: " + request.getCookies()[2].getValue() + "</p>");
//            
            
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
