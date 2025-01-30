package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("attr1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.add("attr2", "value2");

        attributes1.addAll(attributes2);

        Assert.assertEquals(2, attributes1.size());
        Assert.assertTrue(attributes1.hasKey("attr1"));
        Assert.assertTrue(attributes1.hasKey("attr2"));
    }

}