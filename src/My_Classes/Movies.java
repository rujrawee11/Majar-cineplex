package My_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Movies {
    
    private Integer id;
    private String name;
    private String age;
    private String genre;
    private String times;
    private String cinemas;
    private String date;
    private byte[] image;
    
    public Movies(){}
    
    public Movies(Integer _id,String _name,String _age,String _genre,String _times,
                String _cinemas,String _date,byte[] _image)
    {
        this.id = _id;
        this.name = _name;
        this.age = _age;
        this.genre = _genre;
        this.times = _times;
        this.cinemas = _cinemas;
        this.date= _date;
        this.image = _image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }


    public String getCinemas() {
        return cinemas;
    }

    public void setCinemas(String cinemas) {
        this.cinemas = cinemas;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

   

    public Func_Class getFunc() {
        return func;
    }

    public void setFunc(Func_Class func) {
        this.func = func;
    }
  
    Func_Class func = new Func_Class();

    /*public void addBook(String _name,String _age,String _genre,String _times,
                String _cinemas,String _date,byte[] _image)
    {
        String insertQuery = "INSERT INTO `movies`(`name`, `age, `genre`, `times`,`cinemas`, `date`, `cover_image`) VALUES (?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
           
            ps.setString(1, _name);
            ps.setString(2, _age);
            ps.setString(3, _genre);
            ps.setString(4, _times);
            ps.setString(5, _cinemas);
            ps.setString(6, _date);
            ps.setBytes(7, _image);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Book Added","add Book",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Book Not Added","add book",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    
    /*public void editBook(int _id, String _isbn,String _name,String _age,String _genre,String _times,
                String _publisher,String _cinemas,String _date_received,String _description,byte[] _cover)
    {
        String updateQuery;
        PreparedStatement ps;
        
        try {
            
        if(_cover != null) // if you want to update the book image
        {
           updateQuery = "UPDATE `books` SET `name`=?,`author_id`=?,`genre_id`=?,`quantity`=?,`publisher`=?,`price`=?,`date_received`=?,`description`=?,`cover_image`=? WHERE `id`=?"; 
       
            ps = DB.getConnection().prepareStatement(updateQuery);
            
            //ps.setString(1, _isbn);
            ps.setString(1, _name);
            ps.setString(2, _age);
            ps.setString(3, _genre);
            ps.setString(4, _times);
            ps.setString(5, _publisher);
            ps.setString(6, _cinemas);
            ps.setString(7, _date_received);
            ps.setString(8, _description);
            ps.setBytes(9, _cover);
            ps.setInt(10, _id);
        
        } 
        else
        {
           updateQuery = "UPDATE `books` SET `name`=?,`author_id`=?,`genre_id`=?,`quantity`=?,`publisher`=?,`price`=?,`date_received`=?,`description`=? WHERE `id`=?"; 
           
           ps = DB.getConnection().prepareStatement(updateQuery);
            
            //ps.setString(1, _isbn);
            ps.setString(1, _name);
            ps.setString(2, _age);
            ps.setString(3, _genre);
            ps.setString(4, _times);
            ps.setString(5, _publisher);
            ps.setString(6, _cinemas);
            ps.setString(7, _date_received);
            ps.setString(8, _description);
            //ps.setBytes(9, _cover);
            ps.setInt(9, _id);
        
        }
        
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Book Edited","edit Book",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Book Not Edited","edit book",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
   
   
    // remove book by id
    /*public void removeBook(int _id )
    {
        String removeQuery = "DELETE FROM `books` WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
            ps.setInt(1, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Book Deleted","remove",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Book Not Deleted","remove",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    

    /*public boolean isISBNexists(String _isbn)
    {
        String query = "SELECT * FROM `books` WHERE `isbn` = '"+_isbn+"'";
        
        ResultSet rs = func.getData(query);
        try {
                if(rs.next()){
                    return true; // if this isbn exist return true
                }
                else
                {
                    return false;// if not return false
                }
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }*/
    
   /* public Book searchBookbyId_Isbn(int _id, String _isbn)
    {
        String query = "SELECT * FROM `books` WHERE `id` = "+_id+" or `isbn` = '"+_isbn+"'";
        
        ResultSet rs = func.getData(query);
        Book book = null;
        
        try {
                if(rs.next())
                {
                    book = new Book(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),
                                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                                    rs.getString(9),rs.getString(10), rs.getBytes(11));
                }
                else
                {
                  return book;
                }
        } 
        catch (SQLException ex)
        {
            //Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("search notfound");
        }
        
        return  book;
        
    }*/
    

    public ArrayList<Movies> booksList(String query)
    {
        ArrayList<Movies> bList = new ArrayList<>();
        
        try {
            
            if (query.equals("")) 
              {
                 query =  "SELECT * FROM `movies`";   
              }
            
            ResultSet rs = func.getData(query);
            
            Movies book;
            
            while(rs.next())
            {    
                book = new Movies(rs.getInt(1),rs.getString(2), rs.getString(3),
                                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                                    rs.getBytes(8));
                bList.add(book);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Movies.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bList;
    }
    

    public Movies getBookById(Integer _id) throws SQLException
    {
        // query to get the book by the id
        String query = "SELECT * FROM `movies` WHERE `id`= "+_id;
        
        ResultSet rs = func.getData(query);
        
        if(rs.next())
        {
            // return the book 
          return new Movies(rs.getInt(1),rs.getString(2), rs.getString(3),
                                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                                    rs.getBytes(8));
        }
        else
        {
            // return null
          return null;    
        }
    }
    

    public void displayBooksCover(JLabel[] labels_tab)
    {
        ResultSet rs;
        Statement st;
        
       try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery("SELECT `image` FROM `movies` order by id desc LIMIT 6");
            byte[] image;
            int i = 0; 
            while(rs.next()) 
            {
               image = rs.getBytes("image");
               func.displayImage(191, 191, image, name, labels_tab[i]);
               i++;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("non");
        }
    }
    
    
    /*public void setQuantity_Minus_One(int _book_id, int _quantity)
    {
        String updateuantityQuery;
        PreparedStatement ps;
        
        try {
            
            updateuantityQuery = "UPDATE `books` SET `quantity`=?  WHERE `id`=?"; 
       
            ps = DB.getConnection().prepareStatement(updateuantityQuery);
            
            ps.setInt(1, _quantity);
            ps.setInt(2, _book_id);
        
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "This Book Is Set To Lost -> The Quantity = Quantity - 1 ","edit Book Quantity",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Book Quantity Not Edited","edit Book Quantity",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    
}
