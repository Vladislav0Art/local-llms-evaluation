package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedObjectsEqualityTest {

    @Test
    public void objectsEqualityTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("attr1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.add("attr1", "value1");

        Attributes attributes3 = new Attributes();
        attributes3.add("attr2", "value2");

        Assert.assertEquals(attributes1, attributes2);
        Assert.assertNotEquals(attributes1, attributes3);
    }

}