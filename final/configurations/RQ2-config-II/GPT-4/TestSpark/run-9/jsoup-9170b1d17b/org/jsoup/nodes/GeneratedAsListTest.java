package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        Assert.assertEquals(attributes.asList().size(), 1);
        Assert.assertEquals(attributes.asList().get(0), new Attribute("key", "value"));
    }

}