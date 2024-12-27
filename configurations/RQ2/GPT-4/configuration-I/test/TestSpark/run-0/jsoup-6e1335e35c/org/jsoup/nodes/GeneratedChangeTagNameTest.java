package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedChangeTagNameTest {

    @Test
    public void changeTagNameTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        element.tagName("div");
        assertEquals("div", element.tagName());
    }

}