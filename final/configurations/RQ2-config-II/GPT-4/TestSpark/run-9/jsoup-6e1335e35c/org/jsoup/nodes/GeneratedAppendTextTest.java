package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAppendTextTest {

    @Test
    public void appendTextTest() {
        Element element = new Element("tag");
        element.appendText("myText");
        Assert.assertEquals("myText", ((TextNode) element.childNode(0)).getWholeText());
    }

}