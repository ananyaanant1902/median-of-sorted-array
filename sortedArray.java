public class More {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        medianOfSortedArray(arr);

    }

public static void medianOfSortedArray(int[] arr){
        int k=0;
        int r=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Median is");
        if(arr.length%2!=0){
            System.out.println(arr[arr.length/2]);
        }else{
            System.out.println(arr[arr.length/2-1]+" and "+arr[(arr.length/2)]);
        }
    }
}
