package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Iterator<Attribute> iterator = attrs.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("key", iterator.next().getKey());
    }

}