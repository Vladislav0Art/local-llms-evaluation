package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = (Attributes) attrs1.clone();
        Assert.assertEquals(attrs1, attrs2);
    }

}