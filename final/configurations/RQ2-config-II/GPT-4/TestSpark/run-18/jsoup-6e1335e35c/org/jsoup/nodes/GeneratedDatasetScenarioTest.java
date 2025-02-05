package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedDatasetScenarioTest {

    @Test
    public void datasetScenarioTest() {
        Element element = new Element("p");
        element.attr("data-test", "test-data");
        assertTrue(element.dataset().containsKey("test"));
    }

}