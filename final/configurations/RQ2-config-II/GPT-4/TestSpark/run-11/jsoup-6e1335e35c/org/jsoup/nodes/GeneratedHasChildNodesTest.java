package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element e = new Element("tag");
        Assert.assertFalse("Check new Element has no children", e.hasChildNodes());
        e.appendChild(new Element("child"));
        Assert.assertTrue("Check Element with child", e.hasChildNodes());
    }

}