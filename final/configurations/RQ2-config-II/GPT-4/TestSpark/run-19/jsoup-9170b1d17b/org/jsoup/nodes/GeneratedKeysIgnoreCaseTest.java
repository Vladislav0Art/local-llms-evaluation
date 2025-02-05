package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedKeysIgnoreCaseTest {

    @Test
    public void keysIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value");
        assertTrue(attrs.hasKeyIgnoreCase("key"));
        assertEquals("value", attrs.getIgnoreCase("key"));
        attrs.removeIgnoreCase("key");
        assertFalse(attrs.hasKey("key"));
    }

}