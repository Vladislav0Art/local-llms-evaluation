package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Element element = Jsoup.parse("<div data-test='testValue'></div>");
        Assert.assertEquals("testValue", element.dataset().get("test"));
    }

}