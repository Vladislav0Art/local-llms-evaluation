package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddKeyWithValueTest {

    @Test
    public void addKeyWithValueTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

}