
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author rahmashareef
 */
public class Renter {

    private static String firstName;
    private static String lastName;
    private String email;
    private static String userName;
    private String password;
    private String creditCard;
    private String discountCode = null;

    /**
     *
     * @param firstName
     * @param lastName
     * @param email
     * @param userName
     * @param password
     * @param creditCard
     * @param discountCode
     * constructor  with parameter
     */
    public Renter(String firstName, String lastName, String email, String userName, String password, String creditCard, String discountCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.creditCard = creditCard;
        this.discountCode = discountCode;
    }

    /**
     *
     * @return 
     * this method return the attribute firstName of renter who rent the car
     */
    public static String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * this method set the attribute firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     * this method return the attribute lastName  of renter who rent the car
     */
    public static String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     * this method set the attribute lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     * this method return the attribute email  of renter who rent the car
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * this method set the attribute email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * this method return the attribute userName  of renter who rent the car
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     * this method set the attribute userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return
     * this method return the attribute password of renter who rent the car
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     * this method set the attribute password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     * this method return the attribute creditCard of renter who rent the car
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     *
     * @param creditCard
     * this method set the attribute creditCard
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     *
     * @return
     * this method return the attribute discountCode  of renter who rent the car
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     *
     * @param discountCode
     * this method set the attribute discountCode
     */
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try (Socket client = new Socket("127.0.0.1", 8189); // create socket with ip and port

                InputStream inStream = client.getInputStream(); // input steam the read data from socket
                Scanner in = new Scanner(new InputStreamReader(inStream, StandardCharsets.UTF_8));
                OutputStream outStream = client.getOutputStream(); // output steam the send data 
                PrintWriter out = new PrintWriter(new OutputStreamWriter(outStream, StandardCharsets.UTF_8), true);) {
            String str;
            str = in.nextLine();
            System.out.println("Server says: " + str);
            out.println("This is the client");
            str = in.nextLine();
            System.out.println("Server says: " + str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


    
    

