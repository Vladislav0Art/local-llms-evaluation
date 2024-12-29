package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIndexOfKeyTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertEquals(0, attributes.indexOfKey("key"));
    }

}