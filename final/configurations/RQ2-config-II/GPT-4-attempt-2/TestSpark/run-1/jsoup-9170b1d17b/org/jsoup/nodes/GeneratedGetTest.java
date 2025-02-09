package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String value = attributes.get("key");
        Assert.assertEquals("value", value);
    }

}