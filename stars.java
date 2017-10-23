import java.util.Scanner;
public class stars
{
    public static int ALength;
    
    public static void main(String[] args)
    {
        getInputs();
        PatternA(ALength);
    }
    
    public static void getInputs(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value");
        ALength = scan.nextInt();
    }
   
    public static void PatternA(int LargestRow){
        for (int i = 0; i < LargestRow; i++){
            printItem(" ", i);
            printItem("*", LargestRow-i);
            System.out.println();
        }
    }
    
    public static void printItem(String st, int num){
        for(int j = 0; j < num ; j++){
            System.out.print(st);
        }
    
        
    }
}
