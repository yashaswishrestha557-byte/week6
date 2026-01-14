
/**
 * Write a description of class Normal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Normal extends Order
{
    public Normal(int orderid, String cname, double amount){
        super(orderid,cname,amount);
    }
    
    @Override
    public double calculateFinalAmount(){
        return super.getAmount();
    }
    
    public double calculateFinalAmount(double discount){
        double a=this.calculateFinalAmount();
        return a-discount;
    }
    
    @Override
    public String toString(){
        return "Order price--> "+ this.calculateFinalAmount();
    }
    
    
}