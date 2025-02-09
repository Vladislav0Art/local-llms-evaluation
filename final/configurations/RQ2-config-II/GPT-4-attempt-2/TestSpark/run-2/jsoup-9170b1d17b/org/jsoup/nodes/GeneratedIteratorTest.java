package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
    }

}