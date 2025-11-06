package com.xworkz.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/sell" ,loadOnStartup=1)
public class BuyerFormServlet extends GenericServlet {
@Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)throws ServletException, IOException {
        System.out.println(servletRequest.getParameter("name"));
        System.out.println(servletRequest.getParameter("sname"));
        System.out.println(servletRequest.getParameter("city"));
        System.out.println(servletRequest.getParameter("state"));
        System.out.println(servletRequest.getParameter("email"));

        System.out.println(servletRequest.getParameter("number"));
        String rd=servletRequest.getParameter("rd");
        System.out.println(rd);
        String rdSell=servletRequest.getParameter("rm");
        System.out.println(rdSell);
        String check=servletRequest.getParameter("agree");
    System.out.println(check);

    }
}
