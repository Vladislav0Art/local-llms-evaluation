package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestDataset {

    private static final String KEY = "test-key";
    private static final String VALUE = "test-value";

    @Before
    public void setup() {
        attributes1 = new Attributes();
        attributes2 = new Attributes();
    }

    @Test
    public void testDataset() {
        Map<String, String> dataset = new HashMap<>();
        dataset.put(KEY, "test");
        dataset.put.equalsIgnoreCase(KEY, "test-value");
        attributes2.dataset(dataset);
        assertEquals("test", attributes2.getValue(KEY));
        assertEquals("test-value", attributes1.getValueIgnoreCase(KEY));
    }

}