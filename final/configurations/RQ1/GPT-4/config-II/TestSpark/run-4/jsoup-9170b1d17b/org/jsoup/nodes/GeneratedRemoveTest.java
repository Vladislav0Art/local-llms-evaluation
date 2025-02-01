package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        attrs.remove("key1");
        Assert.assertFalse(attrs.hasKey("key1"));
    }

}