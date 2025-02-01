package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedGetIgnoreCaseExistingKeyTest {

    @Test
    public void getIgnoreCaseExistingKeyTest() {
        String key = "attributeTestKey";
        String value = "valueTestKey";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        Assert.assertEquals(value, attributes.getIgnoreCase(key.toUpperCase()));
    }

}