package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedGetNonExistentKeyTest {

    @Test
    public void getNonExistentKeyTest() {
        Attributes attrs = new Attributes();
        Assert.assertEquals("", attrs.get("key"));
    }

}