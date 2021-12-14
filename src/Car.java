public class Car {
    String cname;
    int price;
    Car(String cname, int price)
    {
        this.cname=cname;
        this.price=price;
    }
    void Display()
    {
        System.out.println("Name of the company : "+cname);
        System.out.println("Price of the Car    : "+price);
    }
}
class Brand
{
    public static void main(String[] args) {
        Car renault=new Car("Renault",50000000);
        Car bmw=new Car("bmw",10000000);
        Car ferrari=new Car("Ferrari",20);

        renault.Display();
        bmw.Display();
        ferrari.Display();
    }
}
