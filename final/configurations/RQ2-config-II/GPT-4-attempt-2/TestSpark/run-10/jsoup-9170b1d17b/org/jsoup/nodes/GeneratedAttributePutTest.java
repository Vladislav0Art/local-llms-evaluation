package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAttributePutTest {

    @Test
    public void attributePutTest() {
        Attribute attribute = new Attribute("key", "value");
        Attributes attributes = new Attributes();
        attributes.put(attribute);

        Assert.assertTrue(attributes.hasKey("key"));
    }

}