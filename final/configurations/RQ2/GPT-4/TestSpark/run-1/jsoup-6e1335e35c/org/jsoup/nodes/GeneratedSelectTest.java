package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element element = Jsoup.parse("<div class='testClass'>Hello</div>");
        Elements elements = element.select(".testClass");
        Assert.assertEquals(1, elements.size());
    }

}