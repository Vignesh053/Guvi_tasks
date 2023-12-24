package Question_5;

import java.util.Stack;

public class Main {
    static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args)  {
        pushElement(10);
        pushElement(20);
        pushElement(30);

        //print each element of stack
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.elementAt(i));
        }

        //pop the top element
        popElement();

        //print each element after popping
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.elementAt(i));
        }

        //check the stack if there is an element is present or not
        checkStack();

    }

    // function to push the element onto the stack
    static void pushElement(Integer num){
        stack.push(num);
        System.out.println(" the number "+ num + " pushed onto the stack");
    }

    // function to pop the recent or top element on the stack 
    static void popElement(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty, cannot pop");
        } else{
            Integer num = stack.pop();
            System.out.println("Element " + num + " popped from the stack");
        }
    }

    // function to check if the stack is empty or not
    static void checkStack(){
        if(stack.isEmpty()){
            System.out.println("The stack is empty");
        } else{
            System.out.println("the stack is not empty");
        }
    }
}
