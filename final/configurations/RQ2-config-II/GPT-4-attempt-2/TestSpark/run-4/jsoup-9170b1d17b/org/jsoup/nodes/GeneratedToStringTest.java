package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Assert.assertEquals("key=\"value\"", attrs.toString());
    }

}