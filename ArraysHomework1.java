package Arrays.Homework1;
import java.util.Scanner;
import java.util.Arrays;
public class ArraysHomework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Size of the array:");
            int n=input.nextInt();
            int[]myarr=new int[n];
            int[]result=new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++){
                System.out.print((i+1)+". Elements:");
                myarr[i]=input.nextInt();
                                
            } 
            Arrays.sort(myarr);
            System.out.println("Alignment: " +Arrays.toString(myarr));           
            
        }
        
    }

