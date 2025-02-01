package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("key1", "value1");
        String value = attrs.getIgnoreCase("KEY1");
        Assert.assertEquals("value1", value);
    }

}