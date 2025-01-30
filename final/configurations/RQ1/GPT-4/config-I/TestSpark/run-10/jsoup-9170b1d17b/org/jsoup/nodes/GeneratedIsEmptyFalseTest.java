package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedIsEmptyFalseTest {

    @Test
    public void isEmptyFalseTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertFalse(attrs.isEmpty());
        attrs.remove("key");
        Assert.assertTrue(attrs.isEmpty());
    }

}