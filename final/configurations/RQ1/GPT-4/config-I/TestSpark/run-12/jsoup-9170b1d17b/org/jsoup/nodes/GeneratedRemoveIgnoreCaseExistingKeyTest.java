package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedRemoveIgnoreCaseExistingKeyTest {

    @Test
    public void removeIgnoreCaseExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key", "value");
        attributes.removeIgnoreCase("key");
        boolean result = attributes.hasKeyIgnoreCase("Key");
        Assert.assertFalse(result);
    }

}