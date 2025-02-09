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
        Attributes attrs = new Attributes();
        attrs.put("data-key", "value");
        Map<String, String> dataset = attrs.dataset();
        Assert.assertEquals(1, dataset.size());
    }

}