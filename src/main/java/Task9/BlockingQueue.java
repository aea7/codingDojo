package Task9;

import java.util.*;

public class BlockingQueue<T> {

    private List<T> blockingQueue = new LinkedList<T>();
    private int length = 0;

    BlockingQueue(int limit) {
        this.length = limit;
    }

    synchronized void add(T item) throws Exception {
        while (this.blockingQueue.size() == this.length) {
            System.out.println("At the length limit, cannot add to queue: " + item);
            wait();
        }
        if (this.blockingQueue.size() == 0) {
            notifyAll();
        }
        this.blockingQueue.add(item);
    }

    synchronized T remove() throws Exception {
        while (this.blockingQueue.size() == 0) {
            System.out.println("length of queue is 0, cannot remove from queue");
            wait();
        }
        if (this.blockingQueue.size() == this.length) {
            notifyAll();
        }
        return this.blockingQueue.remove(0);
    }

    @Override
    public String toString() {
        StringBuilder queue = new StringBuilder();
        queue.append("[");
        for (T elem : blockingQueue){
            queue.append(" ").append(elem.toString());
        }
        queue.append(" ]");
        return queue.toString();
    }
}
