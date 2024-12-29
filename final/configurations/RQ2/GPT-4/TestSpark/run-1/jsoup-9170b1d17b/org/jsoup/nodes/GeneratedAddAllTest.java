package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes = new Attributes();
        Attributes newAttributes = new Attributes();
        newAttributes.add("key1", "value1");
        attributes.addAll(newAttributes);
        Assert.assertEquals("value1", attributes.get("key1"));
    }

}