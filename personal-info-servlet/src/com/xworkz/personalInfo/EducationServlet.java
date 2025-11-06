package com.xworkz.personalInfo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/education",loadOnStartup = 1)
public class EducationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       String sname= servletRequest.getParameter("Sname");
        String stname=servletRequest.getParameter("stname");
        String ypass=servletRequest.getParameter("ypass");
        String per=servletRequest.getParameter("percentage");

        System.out.println("School name: "+sname);
        System.out.println("Student anem: "+stname);
        System.out.println("Year of passing: "+ypass);
        System.out.println("Percentage: "+per);


        String snamee= servletRequest.getParameter("Sname1");
        String stnamee=servletRequest.getParameter("stname1");
        String ypasse=servletRequest.getParameter("ypass1");
        String perr=servletRequest.getParameter("percentage1");

        System.out.println("college name: "+snamee);
        System.out.println("Student anem: "+stnamee);
        System.out.println("Year of passing: "+ypasse);
        System.out.println("Percentage: "+perr);


        String uname=servletRequest.getParameter("Sname");
        String sttname=servletRequest.getParameter("stname");
        String yerpass=servletRequest.getParameter("ypass");
        String stream=servletRequest.getParameter("stream");
        String persen=servletRequest.getParameter("percentage");

        System.out.println("College name: "+uname);
        System.out.println("Student name: "+stnamee);
        System.out.println("Year of passing: "+yerpass);
        System.out.println("Stream: "+stream);
        System.out.println("Percentage: "+persen);


      String pname=  servletRequest.getParameter("Sname");

        System.out.println("College name: !!!!"+pname);
    }
}
