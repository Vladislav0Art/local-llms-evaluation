package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedPrependChildTest {

    @Test
    public void prependChildTest() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element para = new Element(Tag.valueOf("p"), "");
        div.prependChild(para);
        Assert.assertEquals(1, div.children().size());
    }

}