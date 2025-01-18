package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element element = new Element("p");
        element.html("<span>Hello</span>");
        Assert.assertEquals("<span>Hello</span>", element.html());
    }

}