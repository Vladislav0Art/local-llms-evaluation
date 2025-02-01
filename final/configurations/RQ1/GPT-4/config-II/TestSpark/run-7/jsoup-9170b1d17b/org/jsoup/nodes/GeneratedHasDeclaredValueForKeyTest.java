package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedHasDeclaredValueForKeyTest {

    @Test
    public void hasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.put("null_key", null);
        Assert.assertTrue(attributes.hasDeclaredValueForKey("key"));
        Assert.assertFalse(attributes.hasDeclaredValueForKey("null_key"));
    }

}