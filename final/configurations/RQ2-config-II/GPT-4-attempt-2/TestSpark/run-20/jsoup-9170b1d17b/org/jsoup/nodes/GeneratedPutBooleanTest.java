package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutBooleanTest {

    @Test
    public void putBooleanTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        String result = attributes.get("key");
        Assert.assertEquals("", result);
    }

}