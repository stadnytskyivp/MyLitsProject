package lectures.generics;

public class LitsList <T> {
    private Object[] arr = new Object[10];

    public T get(int i){
        return (T) arr[i];
    }

    public void set(T item, int i){
        arr[i]=item;
    }
}
