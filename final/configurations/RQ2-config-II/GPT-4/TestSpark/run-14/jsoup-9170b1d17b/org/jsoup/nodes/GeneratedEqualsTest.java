package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key_ten", "value_ten");

        Attributes attributes2 = new Attributes();
        attributes2.add("key_ten", "value_ten");

        assertEquals(attributes1, attributes2);
    }

}