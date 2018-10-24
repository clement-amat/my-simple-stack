package deqo.cama.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void getValueOnInteger() {
        Item<Integer> item = new Item<>(new Integer(12));
        assertEquals("La valeur est différente de 12", 12, item.getValue().intValue());
    }
}