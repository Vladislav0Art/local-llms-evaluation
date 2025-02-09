package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attrs = new Attributes();
        attrs.put("data-key12", "value12");
        Assert.assertEquals("value12", attrs.dataset().get("key12"));
    }

}