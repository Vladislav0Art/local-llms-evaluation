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

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        String html = "<p>Test text</p>";
        element.html(html);
        assertEquals(html, element.html());
    }

}