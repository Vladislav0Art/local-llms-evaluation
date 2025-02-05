package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;

public class GeneratedIsEmptyFalseTest {

    @Test
    public void isEmptyFalseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertFalse(attributes.isEmpty());
    }

}