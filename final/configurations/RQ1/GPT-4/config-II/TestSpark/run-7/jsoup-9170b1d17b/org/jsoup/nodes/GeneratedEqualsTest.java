package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.put("key", "value");
        attributes2.put("key", "value");
        Assert.assertEquals(attributes1, attributes2);
    }

}