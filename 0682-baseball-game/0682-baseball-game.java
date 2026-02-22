import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        
        for (String op : operations) {
            
            if (op.equals("C")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else if (op.equals("D")) {
                if (!stack.isEmpty()) {
                    stack.push(stack.peek() * 2);
                }
            } 
            else if (op.equals("+")) {
                if (stack.size() >= 2) {
                    int first = stack.pop();
                    int second = stack.peek();
                    stack.push(first);
                    stack.push(first + second);
                }
            } 
            else {
                stack.push(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        
        return sum;
    }
}