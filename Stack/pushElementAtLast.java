package StackandQueue;

import java.util.Stack;

public class pushElementAtLast {
    public static void main(String[] args) {
        Stack <Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        System.out.println(st);
        InsertDown(st, 8);
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
    

}
