package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attrs = new Attributes();

        attrs.add("key", "value");

        Iterator<Attribute> iterator = attrs.iterator();

        assertTrue(iterator.hasNext());
        assertEquals("key", iterator.next().getKey());
    }

}