package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();
        attributes1.put("key1", "value1");
        attributes2.put("key2", "value2");
        attributes1.addAll(attributes2);
        Assert.assertEquals(2, attributes1.size());
        Assert.assertEquals(1, attributes2.size());
    }

}