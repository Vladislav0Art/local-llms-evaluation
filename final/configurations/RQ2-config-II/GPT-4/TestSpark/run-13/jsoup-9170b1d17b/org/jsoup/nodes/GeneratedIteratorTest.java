package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());

        Attribute attribute = iterator.next();
        assertEquals("key", attribute.getKey());
        assertEquals("value", attribute.getValue());
    }

}