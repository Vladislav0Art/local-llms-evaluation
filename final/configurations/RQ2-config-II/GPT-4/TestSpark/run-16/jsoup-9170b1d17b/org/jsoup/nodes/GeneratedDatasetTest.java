package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.add("data-key", "value");
        Map<String, String> dataset = attributes.dataset();
        Assert.assertEquals(1, dataset.size());
        Assert.assertTrue(dataset.containsKey("key"));
        Assert.assertEquals("value", dataset.get("key"));
    }

}