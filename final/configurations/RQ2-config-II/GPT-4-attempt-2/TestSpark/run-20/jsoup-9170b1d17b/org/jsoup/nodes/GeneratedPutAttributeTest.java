package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutAttributeTest {

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.put(attribute);
        String result = attributes.get("key");
        Assert.assertEquals("value", result);
    }

}