package My_Classes;

import My_Forms.ForgetPasswordForm;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Users {
    
    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    


    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Users() {
    }

    public Users(int _id, String _firstname, String _lastname, String _username, String _password) {
        this.id = _id;
        this.firstname = _firstname;
        this.lastname = _lastname;
        this.username = _username;
        this.password = _password;

    }
    
    
 My_Classes.Func_Class func = new Func_Class();
 public boolean checkUsername(String _username)
    {
      ResultSet rs = func.getData("SELECT * FROM `major_users` WHERE `username` = '"+ _username +"'");
      boolean exists = false;      
      
        try {
            if(rs.next())
            {    
               exists = true;    
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return exists;
    }
    public void upUser(String _username,String _password)
    {
        String editQuery = "UPDATE `major_users` SET `password`=? WHERE `username`=?";
        
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

    public void addUser(String _fname,String _lname,String _username,String _password)
    {
        String insertQuery = "INSERT INTO `major_users`(`firstName`, `lastName`, `username`, `password`) VALUES (?,?,?,?)";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _username);
            ps.setString(4, _password);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "User Added","add user",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Added","add user",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       public void addUsers(String _fname,String _lname,String _username,String _password)
    {
        String insertQuery = "INSERT INTO `major_users`(`firstName`, `lastName`, `username`, `password`) VALUES (?,?,?,?)";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _username);
            ps.setString(4, _password);
            
            if(ps.executeUpdate() != 0)
            {
               
            }
            else
            {
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Member getMemberByun(String _user) throws SQLException
    {
        Func_Class func = new Func_Class();
        
        String query = "SELECT * FROM `major_members` WHERE `username`= "+_user;
        
        ResultSet rs = func.getData(query);
        
        if(rs.next())
        {
          return new Member(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getBytes("picture"));
        }
        else
        {
          return null;    
        }
    }

    public void editUser(int _id, String _fname,String _lname,String _username,String _password)
    {
        String editQuery = "UPDATE `major_users` SET `firstName`=?,`lastName`=?,`username`=?,`password`=? WHERE `id`=?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _username);
            ps.setString(4, _password);
            ps.setInt(5, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "User Edited","edit user",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Edited","edit user",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void editUser2(int _id, String _fname,String _lname)
    {
        String editQuery = "UPDATE `major_users` SET `firstName`=?,`lastName`=? WHERE `id`=?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setInt(3, _id);
            
            if(ps.executeUpdate() != 0)
            {
             //   JOptionPane.showMessageDialog(null, "User Edited","edit user",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Edited","edit user",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    public void removeUser(int _id )
    {
        String removeQuery = "DELETE FROM `major_users` WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
            ps.setInt(1, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "User Deleted","remove",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Deleted","remove",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   

    public ArrayList<Users> usersList()
    {
        ArrayList<Users> uList = new ArrayList<>();
        
        try {

            ResultSet rs = func.getData("SELECT * FROM `major_users` where user_type <> 'owner'");
            
            Users user;
            
            while(rs.next())
            {    
                // `id`, `firstName`, `lastName`, `username`, `password`, `user_type`
                user = new Users(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("username"), rs.getString("password"));
                uList.add(user);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uList;
    }

    public Users tryLogin(String _username, String _password)
    {
      
       ResultSet rs = func.getData("SELECT * FROM `major_users` where username = '"+_username+"' and password = '"+_password+"'");
            
            Users user = null;
            
        try {
            if(rs.next())
            {    
                user = new Users(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("username"), rs.getString("password"));
            } 
        } catch (SQLException ex) {
            //Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return user;
    }
}

    