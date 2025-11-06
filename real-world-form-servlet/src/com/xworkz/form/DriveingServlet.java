package com.xworkz.form;

import org.omg.CORBA.ServerRequest;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/drive" ,loadOnStartup = 1)
public class DriveingServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)throws IOException, ServletException{
        String val=servletRequest.getParameter("radio");
        System.out.println(val);
        System.out.println(servletRequest.getParameter("fname"));
        System.out.println(servletRequest.getParameter("sname"));
        System.out.println(servletRequest.getParameter("dob"));
        String cou=servletRequest.getParameter("country");
        System.out.println(cou);
        System.out.println(servletRequest.getParameter("address"));
        System.out.println(servletRequest.getParameter("id"));
        String mm=servletRequest.getParameter("radio");
        System.out.println(mm);


    }

}
