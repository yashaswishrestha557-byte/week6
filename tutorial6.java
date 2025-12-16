
/**
 * Write a description of class tutorial6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial6
{
    public static void main(String args){
        int[] age; //declare
        age=new int[5]; //construct
        System.out.println(age.length); //finding length
        
        age[0]=10; //initializing
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        System.out.println(age[1]); //accessing an individual element
        
        int[] age={10,20,30,40,50};
        System.out.println(age.length-1); //accessing last element
        
        for(int i=0; i<age.length; i++){
            System.out.println(i);
        }
        
        for(int i=age.length-1; i>=0; i--){
            System.out.println(i);
        }
        
        //2D
        int[][] matrix;
        matrix=new int[2][2]; //first rows second coloums
        
        matrix[0][0]=10; //first bhitra ko loop
        matrix[0][1]=20;
        matrix[1][0]=30;
        matrix[1][1]=40;
        
        //2D array in one line
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}}; //backets are rows and nuber inside is coloum
        
        for(int i=0; i<mat.length; i++){
            System.out.println(mat[i]);
            for(int j=0; j< mat[i].length; j++){
                System.out.print(mat[i][j]);
                    
                }
            System.out.println();
            }
        }
        
    }
}