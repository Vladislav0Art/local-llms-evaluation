package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Iterator<Attribute> iterator = attributes.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("key", iterator.next().getKey());
        Assert.assertFalse(iterator.hasNext());
    }

}