import java.util.Scanner;
class CharCheck
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        String ans = (ch>65 && ch <=90)?"Uppercase":"Not Uppercase";
        System.out.println(ans);
    }
}