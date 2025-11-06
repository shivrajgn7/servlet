package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/home",loadOnStartup = 1)
public class SellerFormServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(servletRequest.getParameter("address"));
        String property=servletRequest.getParameter("type");
        System.out.println("no of bed rooms: "+servletRequest.getParameter("bed"));
        System.out.println("no of basth room: "+servletRequest.getParameter("bath"));
        System.out.println(servletRequest.getParameter("year"));
        String parking=servletRequest.getParameter("park");
        System.out.println("parking: "+parking);

        String feature=servletRequest.getParameter("living");
        System.out.println("Owner name: "+servletRequest.getParameter("owner"));
        System.out.println("Your name: "+servletRequest.getParameter("your"));


    }
}
