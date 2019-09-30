package Task9;

public interface BoundedBlockingQueue<T> {
    void add(T t);
    T remove();
}
