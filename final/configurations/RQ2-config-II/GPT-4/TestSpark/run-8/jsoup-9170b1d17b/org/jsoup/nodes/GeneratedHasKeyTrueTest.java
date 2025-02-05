package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;

public class GeneratedHasKeyTrueTest {

    @Test
    public void hasKeyTrueTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

}