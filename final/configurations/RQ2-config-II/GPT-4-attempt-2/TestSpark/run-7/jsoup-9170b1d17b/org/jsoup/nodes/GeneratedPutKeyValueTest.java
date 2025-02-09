package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPutKeyValueTest {

    @Test
    public void putKeyValueTest() {
        Attributes attrs = new Attributes();
        attrs.put("key2", "value2");
        Assert.assertEquals("value2", attrs.get("key2"));
    }

}