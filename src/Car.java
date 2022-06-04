
/**
 *
 * @author Group of project Car Rental 
 */
public class Car {

    private String type;
    private String color;
    private String brand;
    private double price;
    private int counter;
    private boolean selected=false;

    /**
     *
     * @return selected
     * Boolean value indicate if the car selected or not (like flag)
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     *
     * @param selected
     * this method set the attribute Selected
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
    /**
     *
     * @param type
     * @param color
     * @param brand
     * @param price
     * @param count
     *  constructor  with parameter 
     */
    public Car(String type, String color, String brand, double price,int count) {
        this.type = type;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.counter=count;
    }

    /**
     *
     * @return type 
     *  this method return the attribute type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * this method set the attribute type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return color 
     * this method return the attribute color that indicate color of car 
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     * this method set the attribute color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return brand
     * this method return the attribute brand that indicate brand of car 
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     * this method set the attribute brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *
     * @return price
     * this method return the attribute price that indicate price of car
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * this method set the attribute price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return counter
     * this method return the attribute counter that indicate the number of availabile car
     */
    public int getCounter() {
        return counter;
    }

    /**
     *
     * @param counter
     * this method set the attribute counter
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     *
     * @return String 
     * this method return Descrption of car
     */
    public String printDescrption() {
        return  "Type= " + type +"," +"\nBrand= " + brand + ", "+"\nPrice= " + price +" SR";
    }
  
}
