package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        Attribute attribute1 = new Attribute("key1", "value1");
        Attribute attribute2 = new Attribute("key2", "value2");

        attributes.put(attribute1);
        attributes.put(attribute2);

        List<Attribute> attributeList = attributes.asList();
        Assert.assertTrue(attributeList.contains(attribute1));
        Assert.assertTrue(attributeList.contains(attribute2));
    }

}