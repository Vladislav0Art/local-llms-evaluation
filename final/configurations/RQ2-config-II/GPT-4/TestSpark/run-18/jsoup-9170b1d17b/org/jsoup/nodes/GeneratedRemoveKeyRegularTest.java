package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedRemoveKeyRegularTest {

    @Test
    public void removeKeyRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        attrs.remove("key1");
        Assert.assertFalse(attrs.hasKey("key1"));
    }

}