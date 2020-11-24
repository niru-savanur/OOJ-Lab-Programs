
interface IntQueue {
    void insert_rear(int item); 

    int delete_front(); 
    }



    class Queue implements IntQueue {
 private int q[];
 private int rear;
 private int front;

       
 Queue(int size) {
 q = new int[size];
 rear = -1;
 front = 0;
 }

        
 public void insert_rear(int item) {
 if(rear==q.length-1) 
 System.out.println("Queue is full.");
 else
 q[++rear] = item;
 }

       
 public int delete_front() {
 if(front>rear) {
 System.out.println("Queue underflow.");
 front = 0;
 rear = -1;
 return -1;
 }
 return q[front++];
 }
    }


class QueueInter {
 public static void main(String args[]) {


 Queue myqueue = new Queue(8);


 for(int i=0; i<8; i++)
  myqueue.insert_rear(i);

 System.out.println("Values in queue:");
 for(int i=0; i<8; i++)
 System.out.println(myqueue.delete_front());
 }
}
