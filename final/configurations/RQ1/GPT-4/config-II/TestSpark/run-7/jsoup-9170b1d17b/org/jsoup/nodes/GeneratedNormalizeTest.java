package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.normalize();
        Assert.assertEquals("key", attributes.asList().get(0).getKey());
    }

}