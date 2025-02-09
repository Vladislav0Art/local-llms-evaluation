package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("div");
        element.appendElement("p");
        Assert.assertEquals(1, element.childNodeSize());
    }

}