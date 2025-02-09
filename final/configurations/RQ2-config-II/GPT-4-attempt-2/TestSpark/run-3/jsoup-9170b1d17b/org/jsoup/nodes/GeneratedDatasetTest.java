package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.jsoup.nodes.Attributes.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-test", "value");
        Map<String, String> dataset = attributes.dataset();
        assertEquals(1, dataset.size());
        assertTrue(dataset.containsKey("test"));
    }

}