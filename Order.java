
/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    private int orderid;
    private String cname;
    private double amount;
    
    public Order(int orderid, String cname, double amount){
        this.orderid=orderid;
        this.cname=cname;
        this.amount=amount;
    }
    
    public double getAmount(){
        return this.amount;
    }
    public int getOrderid(){
        return this.orderid;
    }
    public String getCname(){
        return this.cname;
    }
    public void setAmount(double amount){
        amount=this.amount;
    }
    
    public double calculateFinalAmount(){
        return this.amount;
    }
    
    @Override
    public String toString(){
        return "Order price--> "+ this.calculateFinalAmount();
    }
    
    public static void main(String[] args){
        Order o1=new Order(12,"abc",500);
        System.out.println(o1.calculateFinalAmount());
        
        Premium p1=new Premium(13,"def",1000);
        System.out.println(p1.calculateFinalAmount(100));
        
        Normal n1=new Normal(14,"ghi",700);
        System.out.println(n1.toString());
    }
}