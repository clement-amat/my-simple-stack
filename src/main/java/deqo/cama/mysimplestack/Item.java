package deqo.cama.mysimplestack;

public class Item<T> {
    private T value;

    public Item(T pValue) {
        value = pValue;
    }

    public T getValue() {
        return value;
    }
}
