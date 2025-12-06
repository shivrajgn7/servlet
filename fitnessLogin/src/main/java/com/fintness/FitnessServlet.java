package com.fintness;

import com.fintness.Dto.FitnessDto;
import com.fintness.exeception.DataDuplication;
import com.fintness.exeception.InvalidException;
import com.fintness.service.FitnessServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet (urlPatterns = "/success",loadOnStartup = 1)
public class FitnessServlet extends HttpServlet {

    FitnessServiceImpl service=new FitnessServiceImpl();
    @SneakyThrows
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("Do post is running");
       String name1= req.getParameter("name");
       String email1 =req.getParameter("email");
       String  age1=req.getParameter("age");
       String gender1=req.getParameter("gender");
       String address1=req.getParameter("address");
       String weight1=req.getParameter("weight");
       String height1=req.getParameter("height");

        FitnessDto fitnessDto=new FitnessDto(name1,email1,age1,gender1,address1,height1,weight1);
        System.out.println(fitnessDto);


        try {
            service.validate(fitnessDto);
//            req.setAttribute("name", name1);
//            req.setAttribute("email", email1);
//            req.setAttribute("age", age1);
//            req.setAttribute("gender", gender1);
//            req.setAttribute("address",address1);
//            req.setAttribute("weight",weight1);
//            req.setAttribute("height",height1);
            req.setAttribute("Success","valid");
            req.setAttribute("dto",fitnessDto);


        }catch (InvalidException ie) {
            req.setAttribute("Invalid","error");
            req.getRequestDispatcher("Result.jsp").forward(req,resp);

            System.out.println("Data is not valid ");
        }catch (DataDuplication mm){
            req.setAttribute("Email","Email is already  registered please provide another email");
            req.getRequestDispatcher("Result.jsp").forward(req,resp);
            throw new RuntimeException(mm);

        }
        req.getRequestDispatcher("Result.jsp").forward(req,resp);


        System.out.println("Do post is endded");

    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        request.getRequestDispatcher("Login.jsp").forward(request,response);
        response.sendRedirect("index.jsp");
    }

}
