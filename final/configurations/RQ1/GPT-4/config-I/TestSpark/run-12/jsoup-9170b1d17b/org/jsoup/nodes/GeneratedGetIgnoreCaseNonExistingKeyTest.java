package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedGetIgnoreCaseNonExistingKeyTest {

    @Test
    public void getIgnoreCaseNonExistingKeyTest() {
        Attributes attributes = new Attributes();
        String result = attributes.getIgnoreCase("nonExistingKey");
        Assert.assertEquals("", result);
    }

}