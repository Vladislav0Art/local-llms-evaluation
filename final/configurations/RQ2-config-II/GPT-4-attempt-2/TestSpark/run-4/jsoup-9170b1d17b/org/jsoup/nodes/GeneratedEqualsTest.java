package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.put("key", "value");

        Assert.assertTrue(attrs1.equals(attrs2));
    }

}