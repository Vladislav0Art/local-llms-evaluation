package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedRemoveObjectTest {

    @Test
    public void removeObjectTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.remove("key");
        Assert.assertEquals("", attrs.get("key"));
    }

}