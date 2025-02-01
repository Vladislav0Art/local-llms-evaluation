package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedHasDeclaredValueForKeyIgnoreCaseTest {

    @Test
    public void hasDeclaredValueForKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.put("NULL_KEY", null);
        Assert.assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase("key"));
        Assert.assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase("null_key"));
    }

}