package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.normalize();
        Assert.assertTrue(attributes.hasKey("key"));
    }

}