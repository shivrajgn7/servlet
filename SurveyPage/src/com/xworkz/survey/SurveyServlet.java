package com.xworkz.survey;

import com.xworkz.survey.dto.SurveyDto;
import com.xworkz.survey.exception.SurveyException;
import com.xworkz.survey.service.SurveyService;
import com.xworkz.survey.service.SurveyServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;

@WebServlet(urlPatterns = "/survey",loadOnStartup = 1)
public class SurveyServlet extends HttpServlet {

    public SurveyServlet(){
        System.out.println("Servlet is runnning");
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        System.out.println("Do post method is running");

        String name=req.getParameter("name");
       String occup= req.getParameter("occup");
       String edd=req.getParameter("education");
       String nativePlace=req.getParameter("native");
       String bike=req.getParameter("bike");
       String car=req.getParameter("car");
       String mobileNumber=req.getParameter("mobile");
       String adharNumber=req.getParameter("adhar");
       String panCard=req.getParameter("pan");
       String voter=req.getParameter("vote");
       String ration=req.getParameter("ration");
      String passport=req.getParameter("pass");
       String bank=req.getParameter("bank");
       String father=req.getParameter("father");
       String mother=req.getParameter("mother");
      String married=req.getParameter("married");
       String hus=req.getParameter("hus");
       String  child=req.getParameter("child");

    SurveyDto surveyDto=new SurveyDto(name,occup,edd,nativePlace,bike,car,Integer.parseInt(mobileNumber),Integer.parseInt(adharNumber),panCard,voter,ration,passport, Integer.parseInt(bank),father,mother,married,hus,Integer.parseInt(child));
        System.out.println(surveyDto);
        SurveyService service=new SurveyServiceImpl();
        try {
            service.ValidateAndSave(surveyDto);
            req.setAttribute("name",name);
            req.setAttribute("occup",occup);
            req.setAttribute("education",edd);
            req.setAttribute("nativeLocate",nativePlace);
            req.setAttribute("bike",bike);
            req.setAttribute("car",car);
            req.setAttribute("mobile",mobileNumber);
            req.setAttribute("adhar",adharNumber);
            req.setAttribute("pan",panCard);
            req.setAttribute("vote",voter);
            req.setAttribute("ration",ration);
            req.setAttribute("pass",passport);
            req.setAttribute("bank",bank);
            req.setAttribute("father",father);
            req.setAttribute("mother",mother);
            req.setAttribute("married",married);
            req.setAttribute("hus",hus);
            req.setAttribute("child",child);

            req.setAttribute("Success","Submited successful");

        } catch (SurveyException e) {
            req.setAttribute("Error","Fields are not filled properly ,submit failed");

        }


        RequestDispatcher requestDispatcher=req.getRequestDispatcher("Result.jsp");
       requestDispatcher.forward(req,resp);

        System.out.println("Do post method is ended");
    }
}
