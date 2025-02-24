package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAdd {

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());

        attributes.add("key1", "value1");
        assertEquals(1, attributes.size());
        assertEquals("value1", attributes.get("key1"));
    }

}