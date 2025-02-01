package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutBooleanAttributeTest {

    @Test
    public void putBooleanAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        Assert.assertTrue(attributes.hasKey("key"));
    }

}