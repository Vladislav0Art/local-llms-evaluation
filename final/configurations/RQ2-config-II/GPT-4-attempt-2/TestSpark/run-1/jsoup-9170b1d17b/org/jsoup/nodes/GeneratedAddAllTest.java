package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.add("key1", "value1");
        attributes2.add("key2", "value2");
        attributes1.addAll(attributes2);
        Assert.assertEquals("value1", attributes1.get("key1"));
        Assert.assertEquals("value2", attributes1.get("key2"));
    }

}