import java.util.Scanner;
class UserChar
{
    public static void main(String[]args) throws InterruptedException
    {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter username:");
        String un = sc.next().toUpperCase();

        for(int i=0;i<un.length();i++)
        {
            System.out.println(un.charAt(i));
        }
    }
}