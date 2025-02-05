package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.hasKey("key"));
        attrs.put("key", "value");
        assertTrue(attrs.hasKey("key"));
    }

}