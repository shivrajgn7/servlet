package com.xworkz.reg;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/booking" ,loadOnStartup = 1)
public class Register extends HttpServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        String  namee=servletRequest.getParameter("movie");
        String place=servletRequest.getParameter("place");
        String thetore=servletRequest.getParameter("option");
        String time=servletRequest.getParameter("apply");
        String textArea=servletRequest.getParameter("review");

        servletResponse.setContentType("text/html");
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.println(namee);
        printWriter.println(place);
        printWriter.println(thetore);
        printWriter.println(time);
        printWriter.println(textArea);
        printWriter.println("<html>");

        printWriter.println("<h1 style=color:red>");

        printWriter.println("Registerd succesfull");

        printWriter.println("</h1>");

        printWriter.println("</html>");


    }
}
