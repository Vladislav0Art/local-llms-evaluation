package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element element = Jsoup.parse("<div><p>Test</p></div>");
        String html = element.html();
        Assert.assertEquals("<p>Test</p>", html);
    }

}