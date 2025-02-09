package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedAddKeyWithValueTest {

    @Test
    public void addKeyWithValueTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

}