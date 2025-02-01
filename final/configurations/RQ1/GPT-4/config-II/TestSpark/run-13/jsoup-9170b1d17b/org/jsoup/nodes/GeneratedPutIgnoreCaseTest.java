package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutIgnoreCaseTest {

    @Test
    public void putIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.putIgnoreCase("KEY", "value");
        Assert.assertEquals(1, attributes.size());
    }

}