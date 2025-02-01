package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedIsEqualTest {

    @Test
    public void isEqualTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        Assert.assertEquals(attrs1, attrs2);
    }

}