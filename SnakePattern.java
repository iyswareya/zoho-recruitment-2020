import java.util.Scanner;
public class SnakePattern{
    
    static public void printSnakePattern(int n){
        int num = 0;
        for(int i=1; i<= n; i++){
            int j = 1;
            for(; j <= n-i; j++){
                System.out.print(" ");
            }
            for(;i%2 == 1 && j<= (2*n)-i; j++){
                System.out.print(++num +" ");
            }
            for(;i%2 == 0 && j<= (2*n)-i; j++){
                System.out.print(num-- + " ");
            }
            num +=n;
            System.out.println();
        }
    }
    
     public static void main(String []args){
         Scanner s = new Scanner(System.in);
         System.out.print("Enter snake matrix length : ");
         System.out.println();
         printSnakePattern(s.nextInt());
         
     }
}
