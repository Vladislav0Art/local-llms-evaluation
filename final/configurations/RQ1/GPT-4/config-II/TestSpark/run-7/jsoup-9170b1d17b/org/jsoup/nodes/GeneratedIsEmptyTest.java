package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
        attributes.put("key", "value");
        Assert.assertFalse(attributes.isEmpty());
    }

}