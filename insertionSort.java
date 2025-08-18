public class insertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){//or temp<arr[j]
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("sorted array is:");
        for(int element:arr){
            System.out.println(element);
        }
    }
    
}
