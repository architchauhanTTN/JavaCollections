package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

class OverflowException extends Exception {
    public OverflowException(String message) {
        super(message);
    }
}
class UnderflowException extends Exception {
    public UnderflowException(String message) {
        super(message);
    }
}
class Stack {
    int max;

    int top;
    List < Integer > list = new ArrayList<>();
    List < Integer > minimum = new ArrayList<>();
    Stack(int max) {
        top = -1;

        this.max = max;


    }
    void push(Integer el) throws OverflowException{
        if(top > max) {
            throw new OverflowException("Stack is over");
        }
        else {
            list.add(el);
            if(top == -1)
                minimum.add(el);
            else {
                if(list.get(top) > el) {
                    minimum.add(el);
                }
                else
                    minimum.add(list.get(top));
            }
            top ++;
        }
    }
    Integer top() throws UnderflowException{
        if(top == 0) throw new UnderflowException("Underflow");
        return list.get(top);
    }
    void pop () throws UnderflowException{
        if(top == -1) throw new UnderflowException("Underflow");
        else {
            minimum.remove(top);
            list.remove(top);
            top--;
        }
    }
    Integer getMin() throws UnderflowException{
        if( top == -1) throw new UnderflowException("Underflow");
        else {
            return minimum.get(top);
        }
    }
    void show () {
        int si = list.size();
        for(int i = 0 ; i < si ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\n--------------------------------------\n");
    }
}

public class Question7 {
    static Scanner sc = new Scanner(System.in);
    public static void answer() {
            Stack stack = new Stack(5);
            while(1 == 1){
                System.out.println("1. Push\n2. Pop\n3. Get Minimum\n4. Show Stack\n5. QUIT");
                int n = sc.nextInt();
                switch (n){
                    case 1: {
                        int x = sc.nextInt();
                        try {
                            stack.push(x);
                        } catch (OverflowException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 2: {
                        try {
                            stack.pop();
                        } catch (UnderflowException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.println(stack.getMin());
                        } catch (UnderflowException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 4: {
                        stack.show();
                        break;
                    }

                    case 5: {
                        exit(0);
                    }
                }
            }
    }
}
