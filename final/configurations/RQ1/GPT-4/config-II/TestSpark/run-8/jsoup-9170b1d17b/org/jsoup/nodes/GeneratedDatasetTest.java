package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-key1", "value1");
        attributes.put("data-key2", "value2");
        Map<String, String> dataset = attributes.dataset();

        assertEquals(2, dataset.size());
        assertTrue(dataset.containsKey("key1"));
        assertTrue(dataset.containsKey("key2"));
        assertEquals("value1", dataset.get("key1"));
        assertEquals("value2", dataset.get("key2"));
    }

}