package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedPutAttributeTest {

    @Test
    public void putAttributeTest() {
        Attribute attribute = new Attribute("key", "value");
        Attributes attributes = new Attributes();
        attributes.put(attribute);
        Assert.assertEquals("value", attributes.get("key"));
    }

}