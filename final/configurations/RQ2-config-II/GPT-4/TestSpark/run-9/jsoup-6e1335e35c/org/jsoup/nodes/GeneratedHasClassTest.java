package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHasClassTest {

    @Test
    public void hasClassTest() {
        Element element = Jsoup.parse("<div class=\"myclass\">content</div>").body().child(0);
        Assert.assertTrue(element.hasClass("myclass"));
    }

}