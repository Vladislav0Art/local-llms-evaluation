package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        Iterator<Attribute> iterator = attrs.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
        }
        Assert.assertEquals(1, counter);
    }

}