package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSiblingElementsTest {

    @Test
    public void siblingElementsTest() {
        Element element = Jsoup.parseBodyFragment("<div><span></span><p></p><a></a></div>").body();
        Elements siblings = element.child(0).siblingElements();
        Assert.assertTrue(siblings.size() == 2);
    }

}