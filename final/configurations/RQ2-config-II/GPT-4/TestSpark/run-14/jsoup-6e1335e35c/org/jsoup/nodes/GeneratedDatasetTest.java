package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("data-test", "test");
        assertEquals("test", element.dataset().get("test"));
    }

}