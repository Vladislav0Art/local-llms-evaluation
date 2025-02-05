package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attr1 = new Attributes();
        attr1.put("key", "value");

        Attributes attr2 = new Attributes();
        attr2.put("key", "value");

        assertTrue(attr1.equals(attr2));
    }

}