package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");

        Iterator<Attribute> iterator = attributes.iterator();

        assertTrue(iterator.hasNext());

        Attribute attribute1 = iterator.next();
        assertEquals("key1", attribute1.getKey());
        assertEquals("value1", attribute1.getValue());

        Attribute attribute2 = iterator.next();
        assertEquals("key2", attribute2.getKey());
        assertEquals("value2", attribute2.getValue());

        assertFalse(iterator.hasNext());
    }

}