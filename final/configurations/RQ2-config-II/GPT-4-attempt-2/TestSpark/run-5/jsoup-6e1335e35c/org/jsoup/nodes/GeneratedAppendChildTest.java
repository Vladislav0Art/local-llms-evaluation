package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        Assert.assertEquals(child, parent.child(0));
    }

}