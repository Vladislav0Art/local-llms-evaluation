package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        Attributes newAttributes = new Attributes();
        newAttributes.add("key2", "value2");
        attributes.addAll(newAttributes);
        Assert.assertEquals(2, attributes.size());
    }

}