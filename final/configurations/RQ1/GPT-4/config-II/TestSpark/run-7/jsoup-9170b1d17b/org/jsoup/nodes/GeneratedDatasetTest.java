package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");
        Assert.assertEquals("value", attributes.dataset().get("key"));
    }

}