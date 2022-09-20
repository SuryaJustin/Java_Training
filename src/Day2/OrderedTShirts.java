package Day2;


public class OrderedTShirts extends TShirtCompany{
    int count;
    char size;
    String color;
    
    
    //Constructor: Once object was created the constructor call automatically
    //class name and constructor name should be same
    //constructor doesn't have a return type
    OrderedTShirts(int count,char size,String color){
        
        //Refers to the current object in amethod or constructor
        this.count=count;
        this.size=size;
        this.color=color;

        System.out.println("PreOrder TShirts Count =" + count + "Size =" + size + "color =" + color);
    }

   public static void main(String[] args){
        OrderedTShirts ot=new OrderedTShirts(50,'M',"Gray");
        ot.Customers();
   }
}
