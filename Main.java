import java.util.Scanner;

public class Main{
    public static void binarySearch(int[]a,int key){
        int start=0;
        int end=a.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(a[mid]==key){
                System.out.println("Element found at index: "+mid);
                return;
            }

            else if(a[mid]>key){
                end=mid-1;
            }

            else{
                start=mid+1;
            }
        }
        System.out.println("Element was not found in the array");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array length:");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                System.out.println("Array is not sorted");
                return;
            }
        }

        System.out.println("Enter the element to be searched: ");
        int key=sc.nextInt();

        binarySearch(a, key);
    }
}