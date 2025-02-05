package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element element = Jsoup.parse("<div><p>text</p><p>more text</p></div>").body().child(0);
        Assert.assertEquals(2, element.select("p").size());
    }

}