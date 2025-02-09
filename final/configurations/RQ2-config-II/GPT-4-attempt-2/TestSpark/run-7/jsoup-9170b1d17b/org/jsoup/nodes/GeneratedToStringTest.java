package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Attributes attrs = new Attributes();
        attrs.put("key14", "value14");
        Assert.assertEquals("key14=\"value14\"", attrs.toString());
    }

}