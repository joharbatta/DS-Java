import java.util.*;

class insertionSort
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); //Scanner
        int n=sc.nextInt();
        int arr[]=new int[n]; //array
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); //input array
        }

        for(int i=1;i<n;i++)
          {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");  //print
        } 
    }
}
