package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        int size = attrs.size();
        Assert.assertEquals(1, size);
    }

}