package com.fintness.Dao;

import com.fintness.Dto.FitnessDto;
import com.fintness.exeception.InvalidException;

import java.sql.SQLException;

public interface FitnessDao<GEN> {
    boolean  saveSuccess(FitnessDto fitnessDto) ;

    boolean checkEmail(FitnessDto email) throws InvalidException;

}
