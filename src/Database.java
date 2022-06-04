
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmashareef
 */
public class Database {

    /**
     *
     * @param args
     *  this main method here we create  database and create table that store the renter information
     */
    public static void main(String[] args) {

        Connection con = null;
        try {

            // (1) load  JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // (2) set the path for the database
            String ConnectionURL = "jdbc:mysql://localhost:3306/Car_Rental";

            // (3) create connection
            con = DriverManager.getConnection(ConnectionURL, "root", "12345678");

            // (4) create statment object
            Statement st = con.createStatement();

            //  (5) excute sql statment
//            st.executeUpdate("CREATE DATABASE Car_Rental");
            String sql = "CREATE TABLE Renter "
                    + "(Firstname VARCHAR(100), "
                    + "Lasttname VARCHAR(100), "
                    + "Email VARCHAR(100),"
                    + "Username  VARCHAR(100) not NULL,"
                    + "Password VARCHAR(100),"
                    + "Creait_card  VARCHAR(100),"
                    + "descount  VARCHAR(100),"
                    + "PRIMARY KEY ( Username ))";

            st.execute("use Car_Rental");
            //sql statment for create Plant table
            String reservation = "CREATE TABLE Rent("
                    + "Name  VARCHAR(10),"
                    + "Car brand VARCHAR(30),"
                    + "Duration  Integer(20),"
                    + "PRIMARY KEY ( Name ),"
                    + "FOREIGN KEY(Username) references Renter(Username))";
            // execute sql statment
        //    st.executeUpdate(reservation);

            
            //st.executeUpdate(sql);


//            st.executeUpdate("INSERT INTO  Renter" + " VALUES('Ahmad', 'Saad','ahmed@gmail.com','ahmed123','12345','123456','null')");
//
//            st.executeUpdate("INSERT INTO  Renter" + " VALUES('Sara', 'Ali','Sara@gmail.com','Sara123','56789','12398','CarR')");

        
            // (6) close connection
            con.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
}
