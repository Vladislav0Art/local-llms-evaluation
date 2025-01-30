package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedGetNonExistingKeyTest {

    @Test
    public void getNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        String result = attributes.get("nonExistingKey");
        Assert.assertEquals("", result);
    }

}