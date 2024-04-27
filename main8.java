public class main8 {
    static int MAX = 4;
    static int[] stack_Arr = new int[MAX];
    static int top = -1;

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(5);
        System.out.println("----------------------------");
        while (top != -1) {
            System.out.println(pop()+" is popped out of the stack");
        }
         System.out.println("This code is developed by MADHU");
   }

    static void push(int data) {
        if (top == MAX - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack_Arr[top] = data;
        System.out.println("Pushed "+data+" onto the stack"); 
    }

    static int pop() {
        int value;
        if (top == -1) {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        value = stack_Arr[top];
        top--;
        return value;
    }
}

