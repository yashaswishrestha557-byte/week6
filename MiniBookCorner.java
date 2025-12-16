
/**
 * Write a description of class MiniBookCorner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniBookCorner {
    public static void main(String[] args) {
        String[] categories = {"Fiction", "Nepali"};
        String[][] title=new String[2][1];
        double[][] price=new double[2][1];

        title[0][0]="Asahamati - 5";
        price[0][0]=750.0;

        title[1][0]="Nepali floklore";
        price[1][0]=500.0;

        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            for (int j=0; j<1; j++){
                System.out.println("Title:"+title[i][j]);
                System.out.println("Price:"+price[i][j]);
            }
        }
    }
}

