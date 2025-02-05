package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedDatasetRegularTest {

    @Test
    public void datasetRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        Map<String, String> dataset = attrs.dataset();
        Assert.assertEquals(1, dataset.size());
        Assert.assertEquals("value1", dataset.get("key1"));
    }

}