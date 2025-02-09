package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element parentEl = new Element("div");
        parentEl.appendChild(new Element("i"));
        parentEl.appendChild(new Element("b"));
        Assert.assertEquals(2, parentEl.childNodeSize());
    }

}