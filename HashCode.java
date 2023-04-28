import java.io.*;
//coded by harish
public class HashCode
{
    public static void main(String args[])
    {
        int arr[] = new int[5]; //crea6ting an integer array of 5 size


        int hashcode= arr.hashCode();

        System.out.println("Arrays Hascode is :"+hashcode);

        System.out.println("Arrays reference is :"+arr);

    }
}