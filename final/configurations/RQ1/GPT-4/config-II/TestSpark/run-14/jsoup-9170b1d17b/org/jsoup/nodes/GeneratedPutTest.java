package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals("value", attrs.get("key"));
        attrs.put("key", "new value");
        Assert.assertEquals("new value", attrs.get("key"));
    }

}