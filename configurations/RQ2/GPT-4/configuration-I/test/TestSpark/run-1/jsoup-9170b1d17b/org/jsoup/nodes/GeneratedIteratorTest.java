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
        Attribute attribute1 = new Attribute("key1", "value1");
        Attribute attribute2 = new Attribute("key2", "value2");
        attributes.put(attribute1);
        attributes.put(attribute2);

        Iterator<Attribute> iterator = attributes.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(attribute1, iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(attribute2, iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

}