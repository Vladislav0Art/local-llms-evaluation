package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        attributes.add("attr2", "value2");

        Iterator<Attribute> iterator = attributes.iterator();

        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("attr1", iterator.next().getKey());
        Assert.assertEquals("attr2", iterator.next().getKey());
        Assert.assertFalse(iterator.hasNext());
    }

}