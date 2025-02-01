package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        assertTrue(attributes.hasKey("key"));
        assertEquals("value", attributes.get("key"));
    }

}