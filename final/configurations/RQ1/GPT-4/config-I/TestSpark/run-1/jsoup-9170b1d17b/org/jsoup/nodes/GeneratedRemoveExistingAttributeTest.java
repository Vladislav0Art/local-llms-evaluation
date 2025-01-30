package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRemoveExistingAttributeTest {

    @Test
    public void removeExistingAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        String value = attributes.get("key");
        Assert.assertEquals("", value);
    }

}