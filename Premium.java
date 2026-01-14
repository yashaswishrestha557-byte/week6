
/**
 * Write a description of class Premium here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Premium extends Order
{
    public Premium(int orderid, String cname, int amount){
        super(orderid,cname,amount);
    }
    
    @Override
    public double calculateFinalAmount(){
        double Premiumamt=500;
        return super.getAmount() + Premiumamt;
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