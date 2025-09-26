import java.util.Scanner;
class CheckUpperCase
{
    public static void main(String[]args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Charcter:");
         char ch = sc.next().charAt(0);

         String ans = (ch>=65 && ch<=90)?("Uppercase Character"):("Lowercase Character");
         System.out.println(ans);
    }


}