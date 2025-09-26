import java.util.Scanner;
class While1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int i =0;
        while(i<num)
        {
            System.out.println(i+" ");
            i++;
        }
    }
}