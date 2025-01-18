package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        Assert.assertEquals(child, parent.child(0));
    }

}