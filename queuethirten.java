public class queuethirten {
    Node front;
    Node rear;
    int size;
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            rear=front=newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;

        }
        size++;
    }
    public void display(){
        Node currentNode = front;
        while(currentNode != null){
            System.out.print(currentNode.data +" ");
            currentNode = currentNode.next;

        }
    }
    public static void main(String[] args){
        queuethirten nums = new queuethirten();
        nums.enqueue(5);
        nums.enqueue(6);
        nums.enqueue(7);
        nums.enqueue(1);
        nums.enqueue(3);
        nums.enqueue(9);
        System.out.println("Elements in the queue:");
        nums.display(); // Display all elements in the queue
    }
}
//Display All Elements in Queue
//cd /f/Restart.practice

//Write a method display() to print all the elements from front to rear.