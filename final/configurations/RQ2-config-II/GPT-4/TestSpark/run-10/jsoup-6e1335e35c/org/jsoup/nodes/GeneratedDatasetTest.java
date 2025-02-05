package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Element element = new Element("div");
        element.attr("data-test", "ex");
        Assert.assertEquals("ex", element.dataset().get("test"));
    }

}