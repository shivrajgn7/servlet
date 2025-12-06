package com.fintness.service;

import com.fintness.Dao.FitnessDaoImpl;
import com.fintness.Dto.FitnessDto;
import com.fintness.exeception.DataDuplication;
import com.fintness.exeception.InvalidException;

import java.sql.SQLException;

public class FitnessServiceImpl implements FitnessService{
FitnessDaoImpl fitnessDao=new FitnessDaoImpl();
   public void validate(FitnessDto fitnessDto) throws InvalidException, SQLException, DataDuplication {
       System.out.println("validation is Started");

       boolean inValid=false;

       if(fitnessDto!=null){
           if(fitnessDto.getAge()==0||fitnessDto.getAge()<=16){
               inValid=true;
           }
           if(fitnessDto.getName()==null||fitnessDto.getName().length()>10){
               inValid=true;
           }
           if(fitnessDto.getEmail()==null){
               inValid=true;
           }
           if(fitnessDto.getWight()==0||fitnessDto.getWight()>=180){
               inValid=true;
           }
           if(fitnessDto.getAddress()==null||fitnessDto.getAddress().length()>=15){
               inValid=true;
           }
           if(fitnessDto.getHeight()==0||fitnessDto.getHeight()>=300){
               inValid=true;
           }

       }
       if(inValid){
           throw  new InvalidException("Not given correct input ");
       }
       if(fitnessDao.checkEmail(fitnessDto)){
           throw new DataDuplication("The email  is already registered please provide another email");
       }

       else {
           fitnessDao.saveSuccess(fitnessDto);
       }
       System.out.println("validation is Ended");

   }
}
