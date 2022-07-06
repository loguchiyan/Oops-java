package encapsulation;
//Encapsulation
class vehicles{
    private String bus_color;
    private String car_Name;
    private int bicycle_no;
    public String getbc(){
        return bus_color;
    }

    public String getcn(){
        return car_Name;
    }

    public int getbn(){
        return bicycle_no;
    }

    public void setbc(String newValue){
        bus_color = newValue;
    }
    
    public void setcn(String newValue){
    	car_Name = newValue;
    }
    public void setbn(int newValue){
    	bicycle_no = newValue;
 
    }
   public void display() {
   // 	System.out.println("HI");
    }
}
class vehi extends vehicles{
	@Override
	public void display() {
    	System.out.println("Overriding method\n");
    }
	//Overload
	public void display(int a) {
    	System.out.println("This is " +a+" wheel vehicle\n");
    }
}
//abstraction
abstract class fourWheeler {
	public abstract void run();
	}
//Inheritance
class Car extends fourWheeler{
	public void run(){
		System.out.println("Car  is in parking slot..");
		}
}
public class Vehicle{
    public static void main(String args[]){
         vehicles obj = new vehicles();
         obj.setbc("Blue");
         obj.setcn("Nano");
         obj.setbn(9543);
         System.out.println(".....ENCAPSULATION.....");
         System.out.println("Bus Colour: " + obj.getbc());
         System.out.println("Car Name: " + obj.getcn());
         System.out.println("Bicycle no: " + obj.getbn());
         System.out.println("\n.....POLYMORPHISM.....");
         obj.display();
         System.out.println(".......OVERRIDE.......");
         vehi v = new vehi();
         v.display();
         System.out.println(".......OVERLOAD.......");
         v.display(4);
         System.out.println("..ABSTRACTION & INHERITANCE..");
         Car c= new Car();
         c.run();
    }
}