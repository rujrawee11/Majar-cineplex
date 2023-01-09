/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ticket {
    private int id;
    private String movie_name;
    private String cinema_name;
    private int number_of_seat;
    private String seat;
    private String time;
    private String price;
    private String date;

    public ticket() {
    }

    public ticket(int id, String movie_name, String cinema_name, int number_of_seat, String seat, String time, String price, String date) {
        this.id = id;
        this.movie_name = movie_name;
        this.cinema_name = cinema_name;
        this.number_of_seat = number_of_seat;
        this.seat = seat;
        this.time = time;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
    }

    public int getNumber_of_seat() {
        return number_of_seat;
    }

    public void setNumber_of_seat(int number_of_seat) {
        this.number_of_seat = number_of_seat;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
   public void addTicket(String _movie_name, String _cinema_name, int _number_of_seat, String _seat, String _time, String _price, String _date) {
        String insertQuery = "INSERT INTO ticket(movie_name, cinema_name, number_of_seat, seat, time, price, date) VALUES (?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _movie_name);
            ps.setString(2, _cinema_name);
            ps.setInt(3, _number_of_seat);
            ps.setString(4, _seat);
            ps.setString(5, _time);
            ps.setString(6, _price);
            ps.setString(7, _date);

            ps.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        }}
    
    public ticket getticById(Integer _id) throws SQLException {
        Func_Class func = new Func_Class();

        String query = "SELECT * FROM `ticket` WHERE `id`= " + _id;

        ResultSet rs = func.getData(query);

        if (rs.next()) {
            return  new ticket(rs.getInt("id"), rs.getString("movie_name"), rs.getString("cinema_name"), rs.getInt("number_of_seat"), rs.getString("seat"), rs.getString("time"), rs.getString("price"), rs.getString("date"));
      } else {
            return null;
        }
    }
    public ArrayList<ticket> ticketsList(String query) {
        ArrayList<ticket> tList = new ArrayList<>();

        My_Classes.Func_Class func = new Func_Class();

        try {

            if (query.equals("")) {
                query = "SELECT * FROM `ticket`";
            }

            ResultSet rs = func.getData(query);

            ticket ticket;

            while (rs.next()) {
                ticket = new ticket(rs.getInt("id"), rs.getString("movie_name"), rs.getString("cinema_name"), rs.getInt("number_of_seat"), rs.getString("seat"), rs.getString("time"), rs.getString("price"), rs.getString("date"));
                tList.add(ticket);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tList;
    }
}
