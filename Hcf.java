import java.io.*;

public class Hcf
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        int n = Integer.parseInt(br.readLine());

        int hcf=1;

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                if(i>hcf)
                {
                    hcf=i;
                }
            }
        }

        System.out.println("HCF of  "+n+" is "+hcf);

    }
}