package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetElementsByClassTest {

    @Test
    public void getElementsByClassTest() {
        Element element = Jsoup.parseBodyFragment("<div><span class='myClass'></span><p class='myClass'></p><a></a></div>").body();
        Elements elements = element.getElementsByClass("myClass");
        Assert.assertTrue(elements.size() == 2);
    }

}