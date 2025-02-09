package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attrs1 = new Attributes();
        attrs1.add("key1", "value1");

        Attributes attrs2 = new Attributes();
        attrs2.add("key2", "value2");

        attrs1.addAll(attrs2);

        Assert.assertEquals(2, attrs1.size());
        Assert.assertEquals("value1", attrs1.get("key1"));
        Assert.assertEquals("value2", attrs1.get("key2"));
    }

}