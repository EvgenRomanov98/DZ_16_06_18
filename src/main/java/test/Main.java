package test;

import java.sql.Driver;
import java.sql.SQLException;
import java.sql.*;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/16_06_18";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qwerty";

    public static void main(String[] args) {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO test (name) VALUES (?)");
            //statement.execute("INSERT INTO test (name) VALUES ('123')");
            //System.out.println(statement.execute("UPDATE test SET name = 'Mishaaaaaaa' WHERE id = 2"));
            //ResultSet resultSet = statement.executeQuery("SELECT * FROM test");
//            statement.addBatch("INSERT INTO test (name) VALUES ('ann')");
//            statement.executeBatch();
//
//            System.out.println(statement.isClosed());
//            statement.close();
//            System.out.println(statement.getConnection());


//            ResultSet resultSet = statement.executeQuery("SELECT * FROM test");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
//            }

//            preparedStatement.setString(1,"ddfdfdf");
//            preparedStatement.execute();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
