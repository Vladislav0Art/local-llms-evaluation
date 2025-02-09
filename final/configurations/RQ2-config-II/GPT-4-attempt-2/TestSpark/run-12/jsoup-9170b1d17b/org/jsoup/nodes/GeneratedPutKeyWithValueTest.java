package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedPutKeyWithValueTest {

    @Test
    public void putKeyWithValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals("value", attributes.get("key"));
    }

}