package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;

public class GeneratedEqualsTrueTest {

    @Test
    public void equalsTrueTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key ", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("key ", "value");

        assertTrue(attributes1.equals(attributes2));
    }

}