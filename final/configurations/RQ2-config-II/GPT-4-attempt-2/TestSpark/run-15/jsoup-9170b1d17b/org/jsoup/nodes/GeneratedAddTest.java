package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
        assertEquals("value", attributes.get("key"));
    }

}