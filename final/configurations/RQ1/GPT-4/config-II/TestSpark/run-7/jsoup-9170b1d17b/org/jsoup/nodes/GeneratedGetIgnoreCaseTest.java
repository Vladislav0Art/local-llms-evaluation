package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        Assert.assertEquals("value", attributes.getIgnoreCase("key"));
        Assert.assertEquals("", attributes.getIgnoreCase("undefined_key"));
    }

}