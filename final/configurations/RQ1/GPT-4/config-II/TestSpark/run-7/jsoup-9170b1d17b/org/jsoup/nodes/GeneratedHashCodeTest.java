package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Assert.assertEquals(Arrays.hashCode(new String[]{"key"}), attributes.hashCode());
    }

}