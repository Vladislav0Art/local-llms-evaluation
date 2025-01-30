package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedGetNotExistingKeyTest {

    @Test
    public void getNotExistingKeyTest() {
        final String key = "key";
        final Attributes attributes = new Attributes();

        final String result = attributes.get(key);
        Assert.assertEquals("", result);
    }

}