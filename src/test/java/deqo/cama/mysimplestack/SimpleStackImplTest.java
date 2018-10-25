package deqo.cama.mysimplestack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleStackImplTest {
    @Test
    public void newStackIsEmptyTest() {
        SimpleStack stack = new SimpleStackImpl();
        assertTrue("Pile crée n'est pas vide", stack.isEmpty());
    }

    @Test
    public void testPush() {
        SimpleStack stack = new SimpleStackImpl();
        for (int i = 0 ; i < 15 ; i ++) {
            stack.push(new Item(new Integer(i)));
        }

        assertEquals("taille pile n'est pas bonne", 15, stack.getSize());
    }
}
