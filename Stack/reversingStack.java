package StackandQueue;

import java.util.Stack;

public class reversingStack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
    public static void InsertDown(Stack<Integer>st,int ele) {
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int item=st.pop();
        InsertDown(st, ele);
        st.push(item);

    }
    
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        int item=st.pop();
        reverseStack(st);
        InsertDown(st, item);
        
    }
}
