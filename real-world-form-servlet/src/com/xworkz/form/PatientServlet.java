package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.xml.ws.WebFault;
import java.io.IOException;
@WebServlet (urlPatterns = "/service",loadOnStartup = 1)
public class PatientServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println( servletRequest.getParameter("fname"));
        System.out.println( servletRequest.getParameter("lname"));
        System.out.println(servletRequest.getParameter("dob"));
        System.out.println(servletRequest.getParameter("gen"));
        System.out.println(servletRequest.getParameter("city"));
        System.out.println(servletRequest.getParameter("state"));
        System.out.println(servletRequest.getParameter("disease"));
        System.out.println(servletRequest.getParameter("email"));
        System.out.println(servletRequest.getParameter("number"));
        System.out.println(servletRequest.getParameter("status"));

    }
}
