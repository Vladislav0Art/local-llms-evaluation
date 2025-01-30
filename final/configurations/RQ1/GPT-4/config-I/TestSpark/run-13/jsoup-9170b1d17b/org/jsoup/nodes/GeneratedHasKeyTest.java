package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        assertTrue(attr.hasKey("Key"));
        assertFalse(attr.hasKey("AnotherKey"));
    }

}