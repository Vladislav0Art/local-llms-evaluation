package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedHasKeyExistingKeyTest {

    @Test
    public void hasKeyExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        boolean result = attributes.hasKey("key");
        Assert.assertTrue(result);
    }

}