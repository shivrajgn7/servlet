package com.xworkz.personalInfo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/skill",loadOnStartup = 1)
public class SkillServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       String yname= servletRequest.getParameter("YourName");
       String email= servletRequest.getParameter("email");
       String pskill= servletRequest.getParameter("pskill");
       String skill= servletRequest.getParameter("sskill");
       String dbase= servletRequest.getParameter("db");
       String ide= servletRequest.getParameter("ide");
       String ui= servletRequest.getParameter("ui");
       String exp= servletRequest.getParameter("experience");
       String frame= servletRequest.getParameter("frames");
       String oskill= servletRequest.getParameter("skill");

        System.out.println("Your Name: "+yname);
        System.out.println("email: "+email);
        System.out.println("primary skill skill: "+pskill);
        System.out.println("secoundary skill: "+skill);
        System.out.println("data base: "+dbase);
        System.out.println("IDE's: "+ide);
        System.out.println("UI: "+ui);
        System.out.println("Experience: "+exp);
        System.out.println("Framework: "+frame);
        System.out.println("Other skill: "+oskill);


    }
}
