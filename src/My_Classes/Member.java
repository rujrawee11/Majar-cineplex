package My_Classes;

import My_Forms.ForgetPasswordForm;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Member {

    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String username;
    private String password;
    private String gender;
    private byte[] picture;

    public Member() {
    }

    public Member(int _id, String _username, String _password, String _fname, String _lname, String _phone, String _email, String _gender, byte[] _picture) {
        this.id = _id;
        this.username = _username;
        this.password = _password;
        this.firstName = _fname;
        this.lastName = _lname;
        this.phone = _phone;
        this.email = _email;
        this.gender = _gender;
        this.picture = _picture;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public byte[] getPicture() {
        return picture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addMember(String _username, String _password, String _fname, String _lname, String _phone, String _email, String _gender, byte[] _pic) {
        String insertQuery = "INSERT INTO `major_members`(`username`,`password`,`firstName`, `lastName`, `phone`, `email`, `gender`, `picture`) VALUES (?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _username);
            ps.setString(2, _password);
            ps.setString(3, _fname);
            ps.setString(4, _lname);
            ps.setString(5, _phone);
            ps.setString(6, _email);
            ps.setString(7, _gender);
            ps.setBytes(8, _pic);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Added", "add member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Added", "add Member", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editMember(Integer _id, String _username, String _password, String _fname, String _lname, String _phone, String _email, String _gender, byte[] _pic) {
        String editQuery = "UPDATE `major_members` SET `username`=?,`password`=?,`firstName`=?,`lastName`=?,`phone`=?,`email`=?,`gender`=?,`picture`=? WHERE `id` =?";

        try {

            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);

            ps.setString(1, _username);
            ps.setString(2, _password);
            ps.setString(3, _fname);
            ps.setString(4, _lname);
            ps.setString(5, _phone);
            ps.setString(6, _email);
            ps.setString(7, _gender);
            ps.setBytes(8, _pic);
            ps.setInt(9, _id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Edited", "edit member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Edited", "edit member", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editMember2(Integer _id, String _fname, String _lname, String _phone, String _email, String _gender, byte[] _pic) {
        String editQuery = "UPDATE `major_members` SET `firstName`=?,`lastName`=?,`phone`=?,`email`=?,`gender`=?,`picture`=? WHERE `id` =?";

        try {

            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);

            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _pic);
            ps.setInt(7, _id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Edited", "edit member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Edited", "edit member", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*public void removeMember(int _id )
    {
        String removeQuery = "DELETE FROM `members` WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
            ps.setInt(1, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Deleted","remove",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Deleted","remove",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
     public void upMember(String _username,String _password)
    {
        String editQuery = "UPDATE `major_members` SET `password`=? WHERE `username`=?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
         
    
            ps.setString(2,_username);
            ps.setString(1, _password);
  
       
            
            if(ps.executeUpdate() != 0)
            {
                ForgetPasswordForm reset = new ForgetPasswordForm();
                 reset.dispose();
                 
//                JOptionPane.showMessageDialog(null, "User Edited","edit user",1);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Edited","edit user",2);
            }
            
        } catch (SQLException ex) {
            System.out.println("a");
        }
        
        
    }
    public Member getMemberById(Integer _id) throws SQLException {
        Func_Class func = new Func_Class();

        String query = "SELECT * FROM `major_members` WHERE `id`= " + _id;

        ResultSet rs = func.getData(query);

        if (rs.next()) {
            return new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getBytes("picture"));
        } else {
            return null;
        }
    }

    public Member getMemberByFirstname(String _user) throws SQLException {
        Func_Class func = new Func_Class();

        String query = "SELECT * FROM `major_members` WHERE `firstName` = '"+ _user +"'";
        Member member;
        member=null;
        ResultSet rs = func.getData(query);
        try {
            if (rs.next()) {
            member = new Member(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("phone"), rs.getString("email"), rs.getString("gender"), rs.getBytes("picture"));
                }
        } catch (SQLException ex) {
            //Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return member;
    }

    public ArrayList<Member> membersList(String query) {
        ArrayList<Member> mList = new ArrayList<>();

        My_Classes.Func_Class func = new Func_Class();

        try {

            if (query.equals("")) {
                query = "SELECT * FROM `major_members`";
            }

            ResultSet rs = func.getData(query);

            Member member;

            while (rs.next()) {
                member = new Member(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("phone"), rs.getString("email"), rs.getString("gender"), rs.getBytes("picture"));
                mList.add(member);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mList;
    }

}
