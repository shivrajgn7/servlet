package com.xworkz.survey.service;

import com.sun.media.sound.InvalidDataException;
import com.xworkz.survey.dto.SurveyDto;
import com.xworkz.survey.exception.SurveyException;

public interface SurveyService {
    public void ValidateAndSave(SurveyDto surveyDto)throws SurveyException;
}
