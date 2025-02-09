package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        attrs.remove("key");
        Assert.assertFalse(attrs.hasKey("key"));
    }

}