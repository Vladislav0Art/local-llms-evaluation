package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedRemoveIteratorTest {

    @Test
    public void removeIteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        attributes.add("attr2", "value2");

        Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        Assert.assertEquals(0, attributes.size());
    }

}