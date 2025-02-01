package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.put("key2", "value2");
        Assert.assertEquals(2, attrs.asList().size());
    }

}