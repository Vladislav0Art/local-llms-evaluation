package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedHasKeyExistentKeyTest {

    @Test
    public void hasKeyExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Assert.assertTrue(attrs.hasKey("key"));
    }

}