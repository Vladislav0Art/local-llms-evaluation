package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedHashCodeSameAttrsTest {

    @Test
    public void hashCodeSameAttrsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.put("key", "value");

        Assert.assertEquals(attrs1.hashCode(), attrs2.hashCode());
    }

}