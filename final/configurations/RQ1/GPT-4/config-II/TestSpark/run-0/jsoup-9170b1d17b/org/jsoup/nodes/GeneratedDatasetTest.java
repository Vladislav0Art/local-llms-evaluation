package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");
        Assert.assertTrue(attributes.dataset().containsKey("key"));
    }

}