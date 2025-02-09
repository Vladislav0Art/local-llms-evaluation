package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasKey("key"));
        assertFalse(attributes.hasKey("nonexistentkey"));
    }

}