package com.fintness.Dao;

import com.fintness.Dto.FitnessDto;
import com.fintness.exeception.InvalidException;
import lombok.SneakyThrows;

import java.sql.*;

public  class FitnessDaoImpl implements FitnessDao {
    String url = "jdbc:mysql://localhost:3306/fitnessClub";
    String user = "root";
    String password = "@0995DuKe";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class name");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SneakyThrows
    public boolean saveSuccess(FitnessDto fitnessDto) {
        System.out.println("save DAO is running ");
        boolean isSaved = false;


        String sqlQuery = "insert into fitness(name, email,age,weight,height,gender,address) values (?,?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {

            System.out.println("JDBC is started inserting");

            preparedStatement.setString(1, fitnessDto.getName());
            preparedStatement.setString(2, fitnessDto.getEmail());
            preparedStatement.setInt(3, fitnessDto.getAge());
            preparedStatement.setInt(4, fitnessDto.getWight());
            preparedStatement.setInt(5, fitnessDto.getHeight());
            preparedStatement.setString(6, fitnessDto.getGender());
            preparedStatement.setString(7, fitnessDto.getAddress());

            int rowsInserted = preparedStatement.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

            System.out.println("JDBC is ended inserting");

        }
        return false;

    }

    @SneakyThrows
    @Override

    public boolean checkEmail(FitnessDto fitnessDto) {
        System.out.println("Email duplication is running");

        String sql = "SELECT COUNT(*) FROM fitness WHERE email = ? ";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            System.out.println("duplication is checking");
            preparedStatement.setString(1, fitnessDto.getEmail());

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // If email exists, resultSet.next() returns true
                    return resultSet.getInt(1) > 0;
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Email duplication is endded");
            return false;  // Email not found
        }

    }
}

