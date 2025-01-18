package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("p").id("myId");
        Assert.assertEquals("myId", element.id());
    }

}