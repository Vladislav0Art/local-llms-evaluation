package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedGetExistingKeyTest {

    @Test
    public void getExistingKeyTest() {
        final String key = "key";
        final String value = "value";
        final Attributes attributes = new Attributes();
        attributes.add(key, value);

        final String result = attributes.get(key);
        Assert.assertEquals(value, result);
    }

}