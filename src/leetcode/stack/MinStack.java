package leetcode.stack;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

      public MinStack() {
          stack = new Stack<>();
          minStack = new Stack<>();
        }
        public void push(int val) {
            stack.push(val);
            val = minStack.isEmpty()?val:Math.min(val, minStack.peek());
            minStack.push(val);
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
          return minStack.peek();
        }
    }


//    found this other solution, quite impressive, add it in your excel
//class MinStack {
//
//    private Node head;
//
//    public MinStack() {
//    }
//
//    public void push(int val) {
//        if (head == null) {
//            head = new Node(val, val, null);
//        } else {
//            head = new Node(val, Math.min(val, head.min), head);
//        }
//    }
//
//    public void pop() {
//        head = head.next;
//    }
//
//    public int top() {
//        return head.val;
//    }
//
//    public int getMin() {
//        return head.min;
//    }
//
//    class Node {
//        int val;
//        int min;
//        Node next;
//
//        private Node(int val, int min, Node next) {
//            this.val = val;
//            this.min = min;
//            this.next = next;
//        }
//    }
//}
//
