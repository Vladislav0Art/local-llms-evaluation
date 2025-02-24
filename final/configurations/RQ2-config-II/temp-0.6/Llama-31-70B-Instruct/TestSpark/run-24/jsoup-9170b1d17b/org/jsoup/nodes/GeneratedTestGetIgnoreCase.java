package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestGetIgnoreCase {

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.add("testKey", "testValue");
        assertEquals("testValue", attributes.getIgnoreCase("TESTKEY"));
    }

}