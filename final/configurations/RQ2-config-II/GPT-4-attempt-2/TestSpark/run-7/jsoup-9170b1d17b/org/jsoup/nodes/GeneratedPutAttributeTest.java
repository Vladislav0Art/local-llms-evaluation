package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutAttributeTest {

    @Test
    public void putAttributeTest() {
        Attributes attrs = new Attributes();
        attrs.put(new Attribute("key3", "value3"));
        Assert.assertEquals("value3", attrs.get("key3"));
    }

}