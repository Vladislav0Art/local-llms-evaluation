package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key16", "value16");
        int expectedHashCode = attrs.hashCode();
        attrs.put("key17", "value17");
        Assert.assertNotEquals(expectedHashCode, attrs.hashCode());
    }

}