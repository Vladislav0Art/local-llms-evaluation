package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedDatasetScenarioTest {

    @Test
    public void datasetScenarioTest() {
        Element el = new Element("testName");
        assertTrue(el.dataset().isEmpty());
    }

}