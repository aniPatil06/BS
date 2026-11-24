import java.util.Scanner;
public class Main {
 static int binarySearch(int[] a,int key){ int low=0,high=a.length-1; while(low<=high){ int mid=low+(high-low)/2; if(a[mid]==key)return mid; if(a[mid]<key)low=mid+1; else high=mid-1; } return -1; }
 public static void main(String[] args){ Scanner sc=new Scanner(System.in); System.out.print("Enter array size: "); int n=sc.nextInt();
  if(n<0){System.out.println("Invalid input.");return;} int[] a=new int[n]; System.out.println("Enter sorted elements:");
  for(int i=0;i<n;i++)a[i]=sc.nextInt();
  for(int i=1;i<n;i++)if(a[i]<a[i-1]){System.out.println("Array must be sorted.");return;}
  System.out.print("Enter element to search: "); int key=sc.nextInt(); int result=binarySearch(a,key);
  if(result==-1)System.out.println("Element not found.");else System.out.println("Element found at index "+result);
 }
}
