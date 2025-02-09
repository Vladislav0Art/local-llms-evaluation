package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String result = attributes.get("key");
        Assert.assertEquals("value", result);
    }

}