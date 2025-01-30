package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedGetAttributesSizeTest {

    @Test
    public void getAttributesSizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        Assert.assertEquals(1, attributes.size());
    }

}