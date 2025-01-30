package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedRemoveExistentKeyTest {

    @Test
    public void removeExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        attrs.remove("key");
        Assert.assertEquals("", attrs.get("key"));
    }

}