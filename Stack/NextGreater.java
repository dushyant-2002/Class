import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        int[] arr={11,2,3,23,13,9,15};
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+",");
        }
    }
}
