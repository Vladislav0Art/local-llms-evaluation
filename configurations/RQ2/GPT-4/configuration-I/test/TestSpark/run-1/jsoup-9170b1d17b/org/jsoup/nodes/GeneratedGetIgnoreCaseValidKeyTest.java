package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedGetIgnoreCaseValidKeyTest {

    @Test
    public void getIgnoreCaseValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key", "value");
        Assert.assertEquals("value", attributes.getIgnoreCase("key"));
    }

}