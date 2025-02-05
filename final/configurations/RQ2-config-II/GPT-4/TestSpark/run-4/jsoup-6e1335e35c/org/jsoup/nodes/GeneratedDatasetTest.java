package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        element.attr("data-test", "testData");
        assertEquals("testData", element.dataset().get("test"));
    }

}