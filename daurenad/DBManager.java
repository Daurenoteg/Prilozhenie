package kz.daurenad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
        private Connection connection;
        public void connect() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/devices?useUnicode=true&serverTimezone=UTC","root", ""
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void addDevice(Device device){
            try{

                PreparedStatement statement = connection.prepareStatement("" +
                        "INSERT INTO student (id, name, cost, game, developer, year) " +
                        "VALUES (NULL, ?, ?, ?, ?)"
                );
                statement.setString(1, device.getName());
                statement.setString(2, device.getCost());
                statement.setString(3, device.getGame());
                statement.setString(4, device.getDeveloper());
                statement.setString(5, device.getYear());

                statement.executeUpdate();

                statement.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        public ArrayList<Device> getAllDevice(){
            ArrayList<Device> deviceList = new ArrayList<>();
            try{
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM device");
                ResultSet resultSet = statement.executeQuery();/// Select

                while(resultSet.next()){
                    Integer id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String cost = resultSet.getString("cost");
                    String game = resultSet.getString("game");
                    String developer = resultSet.getString("developer");
                    String year = resultSet.getString("year");

                    deviceList.add(new Device(name, cost, game, developer,year));
                }
                statement.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            return deviceList;
        }
}
