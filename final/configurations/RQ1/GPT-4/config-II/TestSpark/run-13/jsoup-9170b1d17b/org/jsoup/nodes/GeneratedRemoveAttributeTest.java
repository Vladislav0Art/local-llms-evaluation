package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveAttributeTest {

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        Assert.assertEquals("", attributes.get("key"));
    }

}