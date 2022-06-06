import java.util.Scanner;
public class usalma {
    static int usHesap(int a , int b){
        int result = (int) Math.pow(a, b);
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz :");
        int a = input.nextInt();
        System.out.print("2. Sayıyı giriniz :");
        int b = input.nextInt();

        int result = usHesap(a, b);
        System.out.print(a + " ^ " + b + " = " + result);


        
    } 

    
}
