package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedNonEmptyAttributesListTest {

    @Test
    public void nonEmptyAttributesListTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        Assert.assertFalse(attributes.isEmpty());
    }

}