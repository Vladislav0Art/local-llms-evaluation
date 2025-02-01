package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        String key = "data-attribute";
        String value = "attributeValue";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        Map<String, String> dataAttributes = attributes.dataset();
        Assert.assertEquals(value, dataAttributes.get("attribute"));
    }

}