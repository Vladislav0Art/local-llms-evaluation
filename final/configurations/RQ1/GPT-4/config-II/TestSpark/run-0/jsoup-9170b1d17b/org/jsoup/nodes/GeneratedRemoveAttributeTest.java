package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveAttributeTest {

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        Assert.assertFalse(attributes.hasKey("key"));
    }

}