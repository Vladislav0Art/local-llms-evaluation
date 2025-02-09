package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key5", "value5");
        Assert.assertTrue(attrs.hasKey("key5"));
        Assert.assertFalse(attrs.hasKey("key6"));
    }

}