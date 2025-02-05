package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedGetIgnoreCaseValidKeyTest {

    @Test
    public void getIgnoreCaseValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key", "value");
        Assert.assertEquals("value", attributes.getIgnoreCase("key"));
    }

}