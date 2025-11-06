package com.xworkz.personalInfo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/service",loadOnStartup = 1)
public class PersonalInfoServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       String fname= servletRequest.getParameter("firstName");
        String sname=servletRequest.getParameter("secondName");
        String email=servletRequest.getParameter("email");
        String number=servletRequest.getParameter("number");
        String age =servletRequest.getParameter("age");
       String dob= servletRequest.getParameter("dateOfBirth");
       String address= servletRequest.getParameter("address");

        System.out.println("First Name : "+fname);
        System.out.println("Secound Name: "+sname);
        System.out.println("Email: "+email);
        System.out.println("Number: "+number);
        System.out.println("Age: "+age);
        System.out.println("Date Of Birth: "+dob);
        System.out.println("Address: "+address);

    }
}
