package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        Attributes result = attributes.put("key", "value");
        Assert.assertEquals("value", result.get("key"));
    }

}