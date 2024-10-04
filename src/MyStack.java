public interface MyStack<T>{
    void push(T elem);

    T peek();

    T pop();

    boolean isEmpty();
}
