package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element el = new Element("div");
        el.tagName("p");
        Assert.assertEquals("<p></p>", el.toString());
    }

}