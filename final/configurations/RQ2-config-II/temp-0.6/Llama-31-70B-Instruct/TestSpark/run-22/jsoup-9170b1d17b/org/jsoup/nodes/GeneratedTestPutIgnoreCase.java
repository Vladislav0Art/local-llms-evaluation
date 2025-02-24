package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPutIgnoreCase {

    @Test
    public void testPutIgnoreCase() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getIgnoreCase("key1"));

        attributes.putIgnoreCase("Key1", "value1");
        assertEquals("value1", attributes.getIgnoreCase("key1"));
    }

}