package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.add("data-test", "value_nine");
        Map<String, String> dataset = attributes.dataset();
        assertEquals("value_nine", dataset.get("test"));
    }

}