package Day2;


public class OrderedTShirts extends TShirtCompany{
    int count;
    char size;
    String color;

    OrderedTShirts(int count,char size,String color){
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
