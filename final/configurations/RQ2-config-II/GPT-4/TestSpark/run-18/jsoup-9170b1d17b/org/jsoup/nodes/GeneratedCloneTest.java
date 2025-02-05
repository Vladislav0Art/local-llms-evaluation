package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        Attributes cloned = attrs.clone();

        Assert.assertEquals(attrs, cloned);
        Assert.assertNotSame(attrs, cloned);
    }

}