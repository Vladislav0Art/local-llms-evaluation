package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedHasKeyIgnoreCaseExistingKeyTest {

    @Test
    public void hasKeyIgnoreCaseExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key", "value");
        boolean result = attributes.hasKeyIgnoreCase("key");
        Assert.assertTrue(result);
    }

}