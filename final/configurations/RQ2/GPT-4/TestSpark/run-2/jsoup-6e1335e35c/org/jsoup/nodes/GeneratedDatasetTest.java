package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Element e = new Element("p");
        e.attr("data-name", "test");
        assertTrue(e.dataset().containsKey("name"));
        assertEquals("test", e.dataset().get("name"));
    }

}