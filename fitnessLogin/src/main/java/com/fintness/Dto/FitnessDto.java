package com.fintness.Dto;

import lombok.Getter;
import lombok.Setter;

public class FitnessDto {
    @Getter
    @Setter

    public String name;
    private String email;
    private int   age;
    private String gender;
    private String address;
    private int wight;
    private  int height;




    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public  FitnessDto(String name, String email, String age, String gender, String address, String height, String weight){
        this.name=name;
        this.email=email;
        this.age=Integer.parseInt(age);
        this.gender=gender;
        this.address=address;
        this.height=Integer.parseInt(height);
        this.wight=Integer.parseInt(weight);
    }

    @Override
    public String toString() {
        return "FinessDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
