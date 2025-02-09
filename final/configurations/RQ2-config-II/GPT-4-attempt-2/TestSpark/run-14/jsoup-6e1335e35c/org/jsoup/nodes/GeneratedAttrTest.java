package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element el = new Element("div");
        el.attr("class", "btn");
        Assert.assertEquals("<div class=\"btn\"></div>", el.toString());
    }

}