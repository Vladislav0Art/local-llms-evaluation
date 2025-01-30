package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedEqualsDifferentAttrsTest {

    @Test
    public void equalsDifferentAttrsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value2");

        Assert.assertFalse(attrs1.equals(attrs2));
    }

}