package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratedChildNodesSizeWithOneChildTest {

    @Test
    public void childNodesSizeWithOneChildTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        Assert.assertEquals(1, parent.childNodeSize());
    }

}