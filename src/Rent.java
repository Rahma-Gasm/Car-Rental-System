

/**
 *
 * @author rahmashareef
 */
public class Rent {

    private String rentCode;

    private int pickUp;

    private int dropOf;

    private static Renter renter;

    private static Car car;

    private static int duration;

    /**
     *
     * @param rentCode
     * @param pickUp
     * @param dropOf
     * @param duration
     * constructor  with parameter 
     */
    public Rent(String rentCode, int pickUp, int dropOf, int duration) {
        this.rentCode = rentCode;
        this.pickUp = pickUp;
        this.dropOf = dropOf;
        this.duration = duration;
    }

    /**
     *
     * @return rentCode
     * this method return the attribute rentCode that indicate code of rent it is unique for each rent
     */
    public String getRentCode() {
        return rentCode;
    }

    /**
     *
     * @param rentCode
     * this method set the attribute rentCode
     */
    public void setRentCode(String rentCode) {
        this.rentCode = rentCode;
    }

    /**
     *
     * @return pickUp
     * this method return the attribute pickUp that indicate the day that the renter want the car
     */
    public int getPickUp() {
        return pickUp;
    }

    /**
     *
     * @param pickUp
     * this method set the attribute pickUp
     */
    public void setPickUp(int pickUp) {
        this.pickUp = pickUp;
    }

    /**
     *
     * @return
     * this method return the attribute dropOf that indicate the day that the renter want return the car
     */
    public int getDropOf() {
        return dropOf;
    }

    /**
     *
     * @param dropOf
     * this method set the attribute dropOf
     */
    public void setDropOf(int dropOf) {
        this.dropOf = dropOf;
    }

    /**
     *
     * @return
     * this method return the attribute renter that indicate the person who rent the car
     */
    public static Renter getRenter() {
        return renter;
    }

    /**
     *
     * @param renter
     * this method set the attribute renter
     */
    public static void setRenter(Renter renter) {
        Rent.renter = renter;
    }

    /**
     *
     * @return car 
     * this method return the attribute car that indicate the car that rent
     */
    public static Car getCar() {
        return car;
    }

    /**
     *
     * @param car
     * this method set the attribute car
     */
    public static void setCar(Car car) {
        Rent.car = car;
    }

    /**
     *
     * @return
     * this method return the attribute duration that indicate the period of rent
     */
    public static int getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     * this method set the attribute duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
 
    /**
     *
     * @return double price
     * this method return the total price 
     */
    public static double calculatePrice() {
        
        int discount = 1;
        if (renter.getDiscountCode() == null) {
            return car.getPrice();
            
        } else {
            discount = Integer.valueOf(renter.getDiscountCode());
        }
        double dis = (car.getPrice() * discount) - car.getPrice();
        return dis * duration;

    }
}
