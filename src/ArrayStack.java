public class ArrayStack implements MyStack<Integer>{
    private int[] array;
    private int stackTopId;
    private int maxSize;

    public ArrayStack(int maxSize) {
        this.array = new int[maxSize];
        this.maxSize = maxSize;
        this.stackTopId = -1;
    }

    @Override
    public void push(Integer elem) {
        if(stackTopId+1 == maxSize){
            throw new IllegalArgumentException("the array is empty");
        }
        stackTopId ++;
        array[stackTopId] = elem;
    }

    @Override
    public Integer peek() {
        if(isEmpty()){
            throw new IllegalArgumentException("It's empty");
        }
        return  array[stackTopId];
    }

    @Override
    public Integer pop(){
        if (isEmpty()){
            throw new IllegalArgumentException("It's empty");
        }
        int i = array[stackTopId--];
        return i;
    }

    @Override
    public boolean isEmpty() {
        return stackTopId == -1;
    }
}
