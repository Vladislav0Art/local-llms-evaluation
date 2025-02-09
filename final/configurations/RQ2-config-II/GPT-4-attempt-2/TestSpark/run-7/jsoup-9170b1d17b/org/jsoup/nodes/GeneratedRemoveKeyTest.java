package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveKeyTest {

    @Test
    public void removeKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key4", "value4");
        attrs.remove("key4");
        Assert.assertEquals("", attrs.get("key4"));
    }

}