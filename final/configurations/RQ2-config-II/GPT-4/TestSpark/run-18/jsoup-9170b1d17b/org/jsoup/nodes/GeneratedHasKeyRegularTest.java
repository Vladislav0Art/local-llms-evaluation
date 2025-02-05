package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedHasKeyRegularTest {

    @Test
    public void hasKeyRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        Assert.assertTrue(attrs.hasKey("key1"));
    }

}