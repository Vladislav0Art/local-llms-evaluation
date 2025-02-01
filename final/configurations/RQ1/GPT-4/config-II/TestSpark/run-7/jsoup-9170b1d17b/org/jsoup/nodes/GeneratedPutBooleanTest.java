package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedPutBooleanTest {

    @Test
    public void putBooleanTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        attributes.put("undefined_key", false);
        Assert.assertEquals("", attributes.get("key"));
        Assert.assertEquals("", attributes.get("undefined_key"));
    }

}