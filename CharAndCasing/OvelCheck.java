import java.util.Scanner;
class OvelCheck
{
    public static void main(String[]args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a Charcater:");
       char ch = sc.next().charAt(0);

       String ans = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?("The given character is Ovel"):("The give character is not ovel");
       System.out.println(ans);
    }
}