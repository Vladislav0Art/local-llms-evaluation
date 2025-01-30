package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Iterator<Attribute> iterator = attributes.iterator();

        Assert.assertTrue(iterator.hasNext());
        Attribute attribute = iterator.next();
        Assert.assertEquals("key", attribute.getKey());
    }

}