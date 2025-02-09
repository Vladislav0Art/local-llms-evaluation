package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key8", "value8");

        Attributes attrs2 = new Attributes();
        attrs2.put("key9", "value9");

        attrs1.addAll(attrs2);
        Assert.assertEquals("value8", attrs1.get("key8"));
        Assert.assertEquals("value9", attrs1.get("key9"));
    }

}