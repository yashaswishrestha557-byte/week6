import java.util.Scanner;

/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(String[] args){
        int[] num={10,20,30,40,50};
        int sum=0;
        for(int i=0; i<=4; i++){
            System.out.println(num[i]);
            sum=sum+i;
        }
        int avg=sum/5;
        
        Scanner scan= new Scanner(System.in);
        int[] arr= new int[2];
        for(int a=0; a<=arr.length; a++){
            System.out.println("Enter you values");
            int n=scan.nextInt();
            System.out.println(arr[a]);
            if(a>2){
                break;
            }
        }
    }
}