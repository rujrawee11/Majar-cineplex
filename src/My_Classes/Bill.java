/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import My_Images.movieticket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Bill {

    private String tickettyp;
    private int price;
    private int qty;
    private int total;

    public Bill() {
    }

    public Bill(String tickettyp, int price, int qty, int total) {
        this.tickettyp = tickettyp;
        this.price = price;
        this.qty = qty;
        this.total = total;
    }

    public String getTickettyp() {
        return tickettyp;
    }

    public void setTickettyp(String tickettyp) {
        this.tickettyp = tickettyp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Bill> billList(String query) {
        ArrayList<Bill> mList = new ArrayList<>();
        movieticket mov = new movieticket();
        My_Classes.Func_Class func = new Func_Class();

        try {

            Bill paper;

            for (int i = 0; i < mov.jTable1.getRowCount(); i++) {
                paper = new Bill(tickettyp, price, qty, total);
                mList.add(paper);
                System.out.println("hi");
                System.out.println(paper);
            }

        } catch (Exception ex) {
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mList;
    }
}
