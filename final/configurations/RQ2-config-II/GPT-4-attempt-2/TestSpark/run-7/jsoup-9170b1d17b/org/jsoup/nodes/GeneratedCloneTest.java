package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attrs = new Attributes();
        attrs.put("key18", "value18");
        Attributes clonedAttrs = attrs.clone();
        Assert.assertNotSame(attrs, clonedAttrs);
        Assert.assertEquals(attrs, clonedAttrs);
    }

}