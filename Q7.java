
/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main(String[] args){
        String[][] s=new String[2][3];
        s[0][0]="Ram";
        s[0][1]="Sita";
        s[0][2]="Hari";
        
        System.out.println("seating charts");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                if(s[i][j]==""){
                    System.out.print("Empty");
                }
                else{
                    System.out.print(s[i][j]);
                }
            }
            System.out.println();
        }
    }
}