package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attrs1 = new Attributes();
        Attributes attrs2 = new Attributes();
        attrs1.put("key15", "value15");
        attrs2.put("key15", "value15");
        Assert.assertTrue(attrs1.equals(attrs2));
    }

}