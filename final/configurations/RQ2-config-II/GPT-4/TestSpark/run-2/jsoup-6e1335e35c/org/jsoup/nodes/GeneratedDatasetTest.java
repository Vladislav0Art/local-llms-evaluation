package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Element element = new Element("div");
        element.attr("data-test", "value");
        assertTrue(element.dataset().containsKey("test"));
        assertEquals("value", element.dataset().get("test"));
    }

}