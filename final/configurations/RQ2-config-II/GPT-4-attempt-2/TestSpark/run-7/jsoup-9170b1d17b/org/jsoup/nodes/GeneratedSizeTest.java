package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key7", "value7");
        Assert.assertEquals(1, attrs.size());
    }

}