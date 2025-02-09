package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes cloned = attributes.clone();
        Assert.assertEquals(attributes, cloned);
        Assert.assertNotSame(attributes, cloned);
    }

}