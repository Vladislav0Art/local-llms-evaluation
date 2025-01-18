package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("testKey", "testValue");
        ArrayList<Attribute> listAttributes = new ArrayList<>();
        listAttributes.add(new Attribute("testKey", "testValue"));
        Assert.assertEquals(listAttributes, attributes.asList());
    }

}