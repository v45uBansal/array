import java.util.*;

class operationsOnArray
{
    public static int search(int arr[], int x)
    {
        int n=arr.length;
         for(int i=0;i<n;i++)
         {
             if(arr[i]==x)
                return i+1;
                
         }
         return -1;
    }
    public static void insert(int arr[], int pos, int n, int capacity, int x)
    {
        //only possible if array has some extra space
        //int n=arr.length;
        if(n==capacity)
              System.out.println("Array Full");
        else
        {      
            int index=pos-1;
            //shift all moves ahead one place
            for(int i=n-1;i>=index;i--)
                arr[i+1]=arr[i];
            arr[index]=x;
            
            for(int i: arr)
                System.out.println(i);
        }
    }
    public static void delete(int arr[], int x)
    {
        int n=arr.length;
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==x)
                break;
        }
        if(i==n)
          System.out.println("Element not found!");
        else
        {
            for(int j=i;j<n-1;j++)
                arr[j]=arr[j+1];
        }  
        for(int k=0;k<n-1;k++)
           System.out.println(arr[k]);
    }

    public static void main(String args[])
    {
        int arr[]= new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println(search(arr, 20));
        insert(arr, 2, 4, 5, 50);
        System.out.println("\n");
        delete(arr, 30);
    }
}
