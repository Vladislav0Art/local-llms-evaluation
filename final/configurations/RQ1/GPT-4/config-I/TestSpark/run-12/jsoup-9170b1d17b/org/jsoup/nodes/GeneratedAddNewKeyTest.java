package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedAddNewKeyTest {

    @Test
    public void addNewKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("newKey", "newValue");
        String result = attributes.get("newKey");
        Assert.assertEquals("newValue", result);
    }

}