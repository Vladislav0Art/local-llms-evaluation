package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHasDeclaredValueForKeyTest {

    @Test
    public void hasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasDeclaredValueForKey("key"));
    }

}