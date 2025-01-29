package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestAsList {

    private static final String KEY = "test-key";
    private static final String VALUE = "test-value";

    @Before
    public void setup() {
        attributes1 = new Attributes();
        attributes2 = new Attributes();
    }

    @Test
    public void testAsList() {
        List<Attribute> list = attributes1.asList();
        assertEquals(1, list.size());
    }

}