package com.xworkz.survey.dto;

import java.io.Serializable;

public class SurveyDto implements Serializable,Comparable {
    private String name;
    private String occupation;
    private String edducation;
    private String nativePlace;
    private String  bike;
    private String car;
    private int mobile;
    private int adhar;
    private String pan;
    private String voter;
    private String ration;
    private String passport;
    private int bank;
    private String father;
    private String mother;
    private String married;
    private  String husbannd;
    private int child;

    public SurveyDto(String name, String occupation, String edducation, String nativePlace, String bike, String car, int mobile, int adhar, String pan, String voter, String ration,String passport, int bank, String father, String mother,String married, String husbannd, int child) {
        this.name = name;
        this.occupation = occupation;
        this.edducation = edducation;
        this.nativePlace = nativePlace;
        this.bike = bike;
        this.car = car;
        this.mobile = mobile;
        this.adhar = adhar;
        this.pan = pan;
        this.voter = voter;
        this.ration = ration;
        this.passport=passport;
        this.bank = bank;
        this.father = father;
        this.mother = mother;
        this.married=married;
        this.husbannd = husbannd;
        this.child = child;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEdducation() {
        return edducation;
    }

    public void setEdducation(String edducation) {
        this.edducation = edducation;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getBike() {
        return bike;
    }

    public void setBike(String bike) {
        this.bike = bike;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getAdhar() {
        return adhar;
    }

    public void setAdhar(int adhar) {
        this.adhar = adhar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getVoter() {
        return voter;
    }

    public void setVoter(String voter) {
        this.voter = voter;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }



    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getHusbannd() {
        return husbannd;
    }

    public void setHusbannd(String husbannd) {
        this.husbannd = husbannd;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "SurveyDto{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", edducation='" + edducation + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", bike='" + bike + '\'' +
                '}';
    }
}
