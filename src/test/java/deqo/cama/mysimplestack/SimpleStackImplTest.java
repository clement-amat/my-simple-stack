package deqo.cama.mysimplestack;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleStackImplTest {

    @Test
    public void newStackIsEmptyTest() {
        SimpleStack stack = new SimpleStackImpl();
        assertTrue("Pile crée n'est pas vide", stack.isEmpty());
    }
}
