package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attrs = new Attributes();
        attrs.put("data-key", "value");
        Map<String, String> dataset = attrs.dataset();
        Assert.assertEquals("value", dataset.get("key"));
    }

}