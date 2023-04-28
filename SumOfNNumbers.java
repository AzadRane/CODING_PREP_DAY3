import java.io.*;


public class SumOfNNumbers
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the numeber :");
        int n = Integer.parseInt(br.readLine());

        int sum=0;

        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        } 

        System.out.println("Sum of "+n+"digits is"+sum);
    }
}