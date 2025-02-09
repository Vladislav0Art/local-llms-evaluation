package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
    }

}