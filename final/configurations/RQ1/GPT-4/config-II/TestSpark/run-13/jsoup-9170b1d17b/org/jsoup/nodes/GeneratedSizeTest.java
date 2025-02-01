package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value");
        attributes.add("key2", "value");
        Assert.assertEquals(2, attributes.size());
    }

}