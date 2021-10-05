//3.A
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int ID;

    //3.B
    public Customer(String _firstName, String _lastName, String _username){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.username = _username;
    }
    public String toString(){
        return "Navn: " + firstName + " " + lastName + "\r\n" +
            "Username: " + username + "\r\n" +
            "ID: " + ID;
    }
    public String getFirstName(){
        return firstName;
    }  
    public String getLastName(){
        return lastName;
    }
    public String getUsername(){
        return username;
    }
    public int getID(){
        return ID;
    }
}
