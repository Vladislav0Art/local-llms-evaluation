package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes newAttributes = new Attributes();
        newAttributes.add("key", "value");
        Assert.assertEquals(attributes, newAttributes);
    }

}