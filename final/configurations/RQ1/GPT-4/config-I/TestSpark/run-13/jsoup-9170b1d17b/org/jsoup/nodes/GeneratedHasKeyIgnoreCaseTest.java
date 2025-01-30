package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasKeyIgnoreCaseTest {

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        assertTrue(attr.hasKeyIgnoreCase("KEY"));
        assertFalse(attr.hasKeyIgnoreCase("AnotherKey"));
    }

}