package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertTrue(attrs.hasKey("key"));
    }

}