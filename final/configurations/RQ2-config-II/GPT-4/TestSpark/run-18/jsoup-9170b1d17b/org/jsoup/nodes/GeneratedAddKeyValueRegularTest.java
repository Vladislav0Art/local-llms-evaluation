package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedAddKeyValueRegularTest {

    @Test
    public void addKeyValueRegularTest() {
        Attributes attrs = new Attributes();
        Attributes returnAttrs = attrs.add("key1", "value1");
        Assert.assertEquals(attrs, returnAttrs);
        Assert.assertEquals("value1", attrs.get("key1"));
    }

}