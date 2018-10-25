package deqo.cama.mysimplestack;

import java.util.EmptyStackException;

public class SimpleStackImpl implements SimpleStack {

    public static final int DEFAULT_LENGTH = 12;

    private int size;
    private Item[] stack;

    public SimpleStackImpl() {
        size = 0;
        stack = new Item[DEFAULT_LENGTH];
    }

    public SimpleStackImpl(int length) {
        size = 0;
        stack = new Item[length];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    public void push(Item item) {
        if (size == stack.length) {
            Item[] newStack = new Item[(int)(size * 1.5)];
            for (int i = 0 ; i < size ; i ++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        stack[size++] = item;

    }
    public Item peek() throws EmptyStackException {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return stack[size-1];
    }
    public Item pop() throws EmptyStackException {
        if (size == 0) {
            throw new EmptyStackException();
        }

        Item toPop = stack[size-1];
        stack[size-1] = null;
        size --;
        return toPop;
    }
}
