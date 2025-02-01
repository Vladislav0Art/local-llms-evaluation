package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        boolean hasKey = attrs.hasKey("key1");
        Assert.assertTrue(hasKey);
    }

}