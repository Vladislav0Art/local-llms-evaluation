package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedRemoveAttributeTest {

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        attributes.remove("attr1");
        Assert.assertFalse(attributes.hasKey("attr1"));
    }

}