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

public class GeneratedSelectNormalCaseTest {

    @Test
    public void selectNormalCaseTest() {
        Element element = new Element("div");
        element.appendChild(new Element("p"));
        Elements elements = element.select("p");
        assertEquals(1, elements.size());
    }

}