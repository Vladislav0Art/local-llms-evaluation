package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Attributes attrs = new Attributes();
        Assert.assertTrue(attrs.isEmpty());
        attrs.put("key", "value");
        Assert.assertFalse(attrs.isEmpty());
    }

}