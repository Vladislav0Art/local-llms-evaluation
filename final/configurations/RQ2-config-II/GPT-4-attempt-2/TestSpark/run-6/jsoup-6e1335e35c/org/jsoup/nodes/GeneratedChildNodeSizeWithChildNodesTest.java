package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildNodeSizeWithChildNodesTest {

    @Test
    public void childNodeSizeWithChildNodesTest() {
        Element element = new Element("div");
        element.appendChild(new Element("p"));
        assertEquals(1, element.childNodeSize());
    }

}