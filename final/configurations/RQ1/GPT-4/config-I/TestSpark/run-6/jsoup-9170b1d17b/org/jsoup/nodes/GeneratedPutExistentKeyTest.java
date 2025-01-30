package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedPutExistentKeyTest {

    @Test
    public void putExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        attrs.put("key", "newVal");
        Assert.assertEquals("newVal", attrs.get("key"));
    }

}