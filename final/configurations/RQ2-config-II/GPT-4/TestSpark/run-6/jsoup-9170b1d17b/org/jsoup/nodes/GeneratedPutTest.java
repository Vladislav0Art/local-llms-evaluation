package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", false);
        Attribute attribute = new Attribute(Tag.valueOf("key3"), "value3");
        attributes.put(attribute);

        assertEquals(3, attributes.size());
        assertEquals("value1", attributes.get("key1"));
        assertEquals("", attributes.get("key2"));
        assertEquals("value3", attributes.get("key3"));
    }

}