package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attrs = new Attributes();
        attrs.put("key11", "value11");
        Assert.assertEquals(1, attrs.asList().size());
    }

}