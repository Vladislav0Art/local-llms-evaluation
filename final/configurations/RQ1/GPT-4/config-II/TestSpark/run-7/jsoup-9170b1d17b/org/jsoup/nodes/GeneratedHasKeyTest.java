package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertTrue(attributes.hasKey("key"));
        Assert.assertFalse(attributes.hasKey("undefined_key"));
    }

}