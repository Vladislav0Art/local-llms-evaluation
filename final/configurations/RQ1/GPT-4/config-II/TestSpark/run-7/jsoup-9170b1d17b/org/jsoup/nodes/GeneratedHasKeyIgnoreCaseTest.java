package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedHasKeyIgnoreCaseTest {

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        Assert.assertTrue(attributes.hasKeyIgnoreCase("key"));
        Assert.assertFalse(attributes.hasKeyIgnoreCase("undefined_key"));
    }

}