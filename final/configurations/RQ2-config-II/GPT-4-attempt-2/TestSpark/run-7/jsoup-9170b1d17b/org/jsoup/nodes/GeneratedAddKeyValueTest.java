package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddKeyValueTest {

    @Test
    public void addKeyValueTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        Assert.assertEquals("value1", attrs.get("key1"));
    }

}