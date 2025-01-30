package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedRemoveExistingKeyTest {

    @Test
    public void removeExistingKeyTest() {
        final String key = "key";
        final Attributes attributes = new Attributes();
        attributes.add(key, "value");

        attributes.remove(key);

        Assert.assertFalse(attributes.hasKey(key));
    }

}