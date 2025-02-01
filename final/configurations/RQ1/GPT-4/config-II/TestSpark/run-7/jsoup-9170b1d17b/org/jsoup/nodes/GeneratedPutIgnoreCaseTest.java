package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedPutIgnoreCaseTest {

    @Test
    public void putIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("key", "value");
        Assert.assertEquals("value", attributes.getIgnoreCase("key"));
    }

}