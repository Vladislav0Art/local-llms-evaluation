package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("key1", "value1");
        attributes1.addAll(attributes2);

        Assert.assertEquals("value", attributes1.get("key"));
        Assert.assertEquals("value1", attributes1.get("key1"));
    }

}