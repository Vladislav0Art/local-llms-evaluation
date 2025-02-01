package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        String key = "attributeTestKey";
        String value = "valueToAdd";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        Iterator it = attributes.iterator();
        Assert.assertTrue(it.hasNext());
    }

}