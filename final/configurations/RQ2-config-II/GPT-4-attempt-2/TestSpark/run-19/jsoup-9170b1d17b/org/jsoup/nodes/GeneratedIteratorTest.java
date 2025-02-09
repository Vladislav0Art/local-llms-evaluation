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

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        Attribute attribute1 = new Attribute("key1", "value1");
        Attribute attribute2 = new Attribute("key2", "value2");

        attributes.add("key1", "value1");
        attributes.add("key2", "value2");

        Iterator<Attribute> iterator = attributes.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("key1=value1", iterator.next().toString());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("key2=value2", iterator.next().toString());
        Assert.assertFalse(iterator.hasNext());
    }

}