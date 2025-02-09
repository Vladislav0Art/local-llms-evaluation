package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Assert.assertEquals(1, attrs.asList().size());
        Assert.assertEquals("key", attrs.asList().get(0).getKey());
    }

}