package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedHasKeyNonExistentKeyTest {

    @Test
    public void hasKeyNonExistentKeyTest() {
        Attributes attrs = new Attributes();
        Assert.assertFalse(attrs.hasKey("key"));
    }

}