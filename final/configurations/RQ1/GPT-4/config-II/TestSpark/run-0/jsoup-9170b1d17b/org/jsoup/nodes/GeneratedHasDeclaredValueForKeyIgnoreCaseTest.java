package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHasDeclaredValueForKeyIgnoreCaseTest {

    @Test
    public void hasDeclaredValueForKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase("KEY"));
    }

}