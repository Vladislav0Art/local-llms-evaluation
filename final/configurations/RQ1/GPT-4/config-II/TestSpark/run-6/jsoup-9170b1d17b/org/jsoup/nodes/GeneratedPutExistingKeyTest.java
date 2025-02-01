package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedPutExistingKeyTest {

    @Test
    public void putExistingKeyTest() {
        String key = "attributeTestKey";
        String value1 = "valueOne";
        String value2 = "valueTwo";
        Attributes attributes = new Attributes();
        attributes.put(key, value1);
        attributes.put(key, value2);
        Assert.assertEquals(value2, attributes.get(key));
    }

}