package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetElementsByTagTest {

    @Test
    public void getElementsByTagTest() {
        Element element = Jsoup.parseBodyFragment("<div><span></span><p></p><a></a></div>").body();
        Elements elements = element.getElementsByTag("a");
        Assert.assertTrue(elements.size() == 1);
    }

}