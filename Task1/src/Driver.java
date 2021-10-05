package src;
//1.A
public class Driver {
    private String name;
    private int age;

    //1.B
    public Driver(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }

    //1.G
    public String toString(){
        return " is driven by "+name;
    }
}
