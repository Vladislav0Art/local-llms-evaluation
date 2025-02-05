package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.put("Data-Key", "value");
        HashMap<String, String> expectedData = new HashMap<>();
        expectedData.put("data-key", "value");
        assertEquals(expectedData, attributes.dataset());
    }

}