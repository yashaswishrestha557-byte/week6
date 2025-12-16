import java.util.Scanner;

/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public static void main(String[] args){
        String[] place={"Morang","kathmandu","Pokhara","Lumbini"};
        for(int i=0; i<=3; i++){
            int n=i+1;
            System.out.println(n+place[i]);
        }
        
        Scanner scan=new Scanner(System.in);
        System.out.println("How many do you want to display");
        int a=scan.nextInt();
        for(int i=0; i<=a; i++){
            System.out.println(place[i]);
            if(i==a){
                break;
            }
          }
    }
}