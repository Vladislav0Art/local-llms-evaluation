package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Attributes clone = attrs.clone();
        Assert.assertEquals(attrs, clone);
        Assert.assertNotSame(attrs, clone);
    }

}