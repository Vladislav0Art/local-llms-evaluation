package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        String key = "attributeTestKey";
        String value = "valueToAdd";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        List attributeList = attributes.asList();
        Assert.assertFalse(attributeList.isEmpty());
    }

}