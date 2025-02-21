package logic1;
import java.util.Stack;
public class NextGreater {
    public static void nextgreater(int arr[] ,int res[]){
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){ //next greater right
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3}; //next first greater in right of x
        int res[]=new int[arr.length];
        nextgreater(arr,res);
    }
}
