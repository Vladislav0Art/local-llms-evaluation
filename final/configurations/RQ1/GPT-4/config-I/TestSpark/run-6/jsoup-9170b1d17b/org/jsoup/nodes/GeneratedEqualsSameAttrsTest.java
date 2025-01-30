package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedEqualsSameAttrsTest {

    @Test
    public void equalsSameAttrsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.put("key", "value");

        Assert.assertTrue(attrs1.equals(attrs2));
    }

}