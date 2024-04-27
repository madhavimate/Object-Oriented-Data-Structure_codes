class MyQueue {
    int size;
    int[] queueArray;
    int front;
    int back;
    int nItems; //no of items in queue

   public MyQueue(int size) {
       queueArray = new int[size]; 
       front = 0;
       back = -1;
       nItems = 0;
   }

   public void insert(int element) {
       if (back == size - 1)
           back = -1;
       queueArray[++back] = element;
       nItems++;
   }

   public int remove() {
       int temp = queueArray[front++];
       if (front == size)
           front = 0;
       nItems--;
       return temp;
   }

}

public class queue {
   public static void main(String[] args) {
       queue1 queue = new queue1(5);
       queue.insert(98);
       System.out.println("98 is enqueued");
       queue.insert(45);
       System.out.println("45 is enqueued");
       queue.insert(7);
       System.out.println(" 7 is enqueued");
       queue.insert(33);
       System.out.println("33 is enqueued");
       System.out.println("--------------");


       int n1 = queue.remove();
       System.out.println(n1 + " is dequeued");

       int n2 = queue.remove();
       System.out.println(n2 + " is dequeued ");

       System.out.println("This code is developed by MADHU");
  
   }
}