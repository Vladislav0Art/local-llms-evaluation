package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        attrs.add("key2", "value2");
        Assert.assertEquals(2, attrs.size());
    }

}