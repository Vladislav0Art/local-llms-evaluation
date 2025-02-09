package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Element element = new Element("div");
        element.attr("data-test", "test");
        Assert.assertEquals("test", element.dataset().get("test"));
    }

}