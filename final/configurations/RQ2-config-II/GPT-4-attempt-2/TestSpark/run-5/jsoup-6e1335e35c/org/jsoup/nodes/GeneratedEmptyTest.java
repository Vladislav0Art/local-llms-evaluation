package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedEmptyTest {

    @Test
    public void emptyTest() {
        Element parent = new Element("div");
        parent.appendChild(new Element("em"));
        parent.appendChild(new Element("strong"));
        parent.empty();
        Assert.assertEquals(0, parent.childrenSize());
    }

}