package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRemoveNonExistingAttributeTest {

    @Test
    public void removeNonExistingAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        String value = attributes.get("key");
        Assert.assertEquals("", value);
    }

}