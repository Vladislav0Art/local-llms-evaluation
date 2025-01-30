package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Assert.assertEquals("value", attrs.get("key"));
    }

}