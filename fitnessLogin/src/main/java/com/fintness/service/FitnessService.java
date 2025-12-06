package com.fintness.service;

import com.fintness.Dto.FitnessDto;
import com.fintness.exeception.DataDuplication;
import com.fintness.exeception.InvalidException;

import java.sql.SQLException;

public interface FitnessService {

    void validate(FitnessDto fitnessDto) throws InvalidException, SQLException, DataDuplication;

}
