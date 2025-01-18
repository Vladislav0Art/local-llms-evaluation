package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedAppendTextTest {

    @Test
    public void appendTextTest() {
        Element element = new Element("p");
        element.appendText("Hello, world!");
        Assert.assertEquals("Hello, world!", element.text());
    }

}