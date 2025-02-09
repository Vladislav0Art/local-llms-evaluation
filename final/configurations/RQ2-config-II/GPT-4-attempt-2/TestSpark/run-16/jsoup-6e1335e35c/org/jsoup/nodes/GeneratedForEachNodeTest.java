package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedForEachNodeTest {

    @Test
    public void forEachNodeTest() {
        Element element = new Element("div").appendText("Test");
        element.forEachNode(node -> node.attr("class", "test"));
        Assert.assertEquals("test", element.childNode(0).attributes().get("class"));
    }

}