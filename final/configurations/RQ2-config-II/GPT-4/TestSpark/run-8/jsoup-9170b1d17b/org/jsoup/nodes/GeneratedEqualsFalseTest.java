package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key ", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("keyB", "valueB");

        assertFalse(attributes1.equals(attributes2));
    }

}