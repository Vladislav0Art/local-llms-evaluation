package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetIgnoreCase {

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getIgnoreCase("key1"));

        attributes.put("key1", "value1");
        assertEquals("value1", attributes.getIgnoreCase("Key1"));
    }

}