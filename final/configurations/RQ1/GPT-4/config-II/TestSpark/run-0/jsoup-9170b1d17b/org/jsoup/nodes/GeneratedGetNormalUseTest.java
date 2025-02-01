package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetNormalUseTest {

    @Test
    public void getNormalUseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.get("key");
        Assert.assertEquals("value", value);
    }

}