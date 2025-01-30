package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedPutExistingAttributeTest {

    @Test
    public void putExistingAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.put("key", "newValue");
        String value = attributes.get("key");
        Assert.assertEquals("newValue", value);
    }

}