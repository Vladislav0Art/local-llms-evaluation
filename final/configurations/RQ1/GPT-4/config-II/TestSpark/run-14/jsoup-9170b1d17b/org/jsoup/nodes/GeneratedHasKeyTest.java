package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertTrue(attrs.hasKey("key"));
        Assert.assertFalse(attrs.hasKey("non-existent-key"));
    }

}