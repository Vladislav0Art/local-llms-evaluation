package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.getIgnoreCase("KEY");
        Assert.assertEquals("value", value);
    }

}