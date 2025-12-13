 import java.util.*;
class Postfix{
    public static int value(char c){
        int v=0;
                if(c=='+'||c=='-'){
                    v=1;
                }
                else  if (c=='*'||c=='/'){
                    v=2;
                }
                else{
                   v=3;
                }
                return v;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Character> sk=new Stack<>();
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                res+=s.charAt(i);
            }
            else if(s.charAt(i)=='('){
                sk.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(!sk.isEmpty() && sk.peek()!='('){
                    res+=sk.pop();
                }
                // if(!sk.isEmpty() && sk.peek()=='(')
                // sk.pop();
            }
           else{
                while(!sk.empty()&&value(s.charAt(i))<value(sk.peek())){
                    res+=sk.pop();
                }
                sk.push(s.charAt(i));
            }
        }
        while(!sk.isEmpty()){
            res+=sk.pop();
        }
        System.out.print(res);
    }
}
// class Postfix{
//     public static  int pr(char ch){
//         if(ch=='^')
//         return 3;
//         else if(ch=='+'||ch=='-')
//         return 2;
//         else  if (ch=='*'||ch=='/')
//         return 1;
//         else 
//         return 0;

//      }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         Stack<Character> st=new Stack<>();
//         StringBuilder res=new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(Character.isLetterOrDigit(ch)){
//                 res.append(ch);
//             }
//             else if(ch=='(')
//             st.push(ch);
//             else if(ch==')'&&!st.empty()){
//                 while(!st.empty() && st.peek()!='('){
//                     res.append(st.pop());
//                 }           
//                 st.pop();
//             }
//         else{
//             while(!st.empty() && pr(ch)<=pr(st.peek())){
//                 res.append(st.pop());
//             }
//             st.push(ch);
//         }
//         }
//         while(!st.empty()){
//             res.append(st.pop());
//         }
//         System.out.print(res.toString());
//     }
// }