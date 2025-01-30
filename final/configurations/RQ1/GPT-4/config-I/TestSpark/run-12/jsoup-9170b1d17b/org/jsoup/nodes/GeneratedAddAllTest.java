package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value2");

        attributes1.addAll(attributes2);
        boolean result = attributes1.hasKey("key2");
        Assert.assertTrue(result);
    }

}