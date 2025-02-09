package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        Map<String, String> dataset = attributes.dataset();
        assertEquals(1, dataset.size());
    }

}