/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quimica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
        
public class Base {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO = "postgres";
    private static final String CONTRASENA = "0000";

    private Connection conexion;

    public Base() {
        try {
            
            Class.forName("org.postgresql.Driver");
           
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarInformacion(String nombre, int edad) {
        String sql = "INSERT INTO tu_tabla (nombre, edad) VALUES (?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setInt(2, edad);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void obtenerInformacion() {
        String sql = "SELECT * FROM baseaguas";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String nombre = resultSet.getString("nestud");
                Double edad = resultSet.getDouble("ph");
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public double [] sdph(String k){
        List<Double> lista = new ArrayList<>();
    String sql = "select ph from baseaguas where localidad = '"+ k + "'";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
              Double n = resultSet.getDouble("ph");
              if (n!= 0){  
              lista.add(n);
              }
             }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        double[] l = lista.stream().mapToDouble(Double::doubleValue).toArray();
        return l;
        
    }
public double [] sdTZ(String k){
        List<Double> lista = new ArrayList<>();
    String sql = "select turbidez from baseaguas where localidad = '"+ k + "'";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
              Double n = resultSet.getDouble("Turbidez");
              if(n!=0){
              lista.add(n);
              }
             }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        double[] l = lista.stream().mapToDouble(Double::doubleValue).toArray();
        return l;
        
    }

    public int cntr(String k){
        String sql = "select count(*) as total from baseaguas where localidad = '"+ k + "'";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
              return resultSet.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        
        return -1;
        
    }

        
        
        
    }





























