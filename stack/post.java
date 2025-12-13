import java.util.*;
public class StackPriority{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char [] ch=str.toCharArray();
        Stack<Character> st=new Stack<>();
        StringBuilder str1=new StringBuilder();        
        for(int i=0;i<ch.length;i++){
            if(Character.isLetterOrDigit(ch[i])){
                str1.append(ch[i]);
           }
           else if(ch[i]=='('){
            st.push(ch[i]);
           }
           else if(ch[i]==')'){
            while(!st.isEmpty() && st.peek()!='('){
                str1.append(st.pop());
            }
            if(!st.isEmpty() && st.peek()=='(')
            st.pop();
           }
           else {
            while( !st.isEmpty() && Priority(ch[i])<=Priority(st.peek()) ){
            str1.append(st.pop());
           }
           st.push(ch[i]);
          
        }   
       
    }
     while(!st.isEmpty()){
            str1.append(st.pop());
        }
    System.out.print(str1);
    }

        public static int Priority(char c){
            if(c=='^'){
                return 3;
            }
            else if(c=='*' || c=='/'){
                return 2;
            }
            else if(c=='+' || c=='-'){
                return 1;
            }
            
                return 0;


        }
       
 
      
    }