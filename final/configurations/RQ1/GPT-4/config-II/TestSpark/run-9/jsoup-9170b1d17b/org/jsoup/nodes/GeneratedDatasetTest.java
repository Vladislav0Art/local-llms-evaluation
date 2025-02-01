package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("data-test", "value");

        Map<String, String> dataSet = attributes.dataset();

        assertNotNull(dataSet);
        assertEquals(1, dataSet.size());
        assertEquals("value", dataSet.get("test"));
    }

}