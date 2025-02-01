package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedAddExistingKeyTest {

    @Test
    public void addExistingKeyTest() {
        String key = "attributeTestKey";
        String value1 = "valueOne";
        String value2 = "valueTwo";
        Attributes attributes = new Attributes();
        attributes.add(key, value1);
        attributes.add(key, value2);
        Assert.assertEquals(value2, attributes.get(key));
    }

}