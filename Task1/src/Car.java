package src;
//1.C
public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    //1.D
    public Car(String _make, String _model, int _year, String _bodyStyle){
        this.make = _make;
        this.model = _model;
        this.year = _year;
        this.bodyStyle = _bodyStyle;
    }

    //1.E
    public Driver getDriver(){
        return driver;
    }
    public void setDriver(Driver _driver){
        this.driver = _driver;
    }

    //1.F
    public String toString(){
        return "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle;
    }
}
