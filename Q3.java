import java.util.Scanner;

/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String[] args){
        String[] name={"Anne", "Sumi", "Subika","sanjee","Ruby"};
        for(int i=0; i<=4; i++){
            System.out.println(name[i]);
        }
        
        System.out.println(name[2]);
        name[4]="yash";
        System.out.println(name[4]);
        
        String[] nname;
        nname= new String[2];
        Scanner scan= new Scanner(System.in);
        System.out.println("enter index value");
        int idx=scan.nextInt();
        System.out.println("Enter your values");
        String val=scan.next();
        nname[idx]= val;
        for(int i=0; i<=2; i++){
            System.out.println(nname[i]);
        }
    }
}