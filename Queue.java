public class Queue {
    int[] queue = new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data){
        if(isFull()){
            System.out.println("queue is full");
        }
        else{

            queue[rear%5] = data;
            rear = rear + 1;
            size = size + 1;
        }
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{

            int data = queue[front%5];
            front = (front + 1)%5;
            size = size - 1;
            return data;
        }
    }
    public int getSize(){
        return size;
    }
    public void show(){
        for(int i = 0;i<size;i++){
            System.out.println(" " + queue[(i+front)%5]);
        }
    }
    public boolean isEmpty(){
        if(getSize() == 0){

            return true;
        }
        else return false;
    }
    public boolean isFull(){
        if(getSize() == 5){

            return true;
        }
        else return false;
    }
}
