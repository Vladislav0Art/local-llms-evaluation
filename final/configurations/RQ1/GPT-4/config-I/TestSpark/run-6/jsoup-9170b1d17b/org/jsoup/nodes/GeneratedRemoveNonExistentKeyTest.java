package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedRemoveNonExistentKeyTest {

    @Test
    public void removeNonExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.remove("key");
        Assert.assertEquals("", attrs.get("key"));
    }

}