package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedGetExistentKeyTest {

    @Test
    public void getExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals("value", attrs.get("key"));
    }

}