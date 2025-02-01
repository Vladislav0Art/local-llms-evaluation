package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedGetAttributeTest {

    @Test
    public void getAttributeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        String value = attrs.get("key1");
        Assert.assertEquals("value1", value);
    }

}