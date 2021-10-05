import java.util.ArrayList;

//3.C
public class Main {
    static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static void main(String[] args) {
        customers.add(new Customer("Lars", "Henriksen", "lars01"));
        customers.add(new Customer("Egon", "Larsen", "LarsenGeden"));
        customers.add(new Customer("Emil", "Michaelsen", "MichaelOst"));
        customers.add(new Customer("James", "Gnomlington", "VoksenLokkeren"));
        customers.add(new Customer("August", "Emil Larsen", "05191"));
        customers.add(new Customer("Lars", "Larsen", "HejMedDig"));

        printCustomers();
    }

    //3.D
    static void printCustomers(){
        for(Customer customer : customers){
            System.out.println(customer.toString());
        }
    }
}
