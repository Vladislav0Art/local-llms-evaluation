package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class GeneratedSelectFirstTest {

    @Test
    public void selectFirstTest() {
        Element element = new Element("div");
        element.appendChild(new Element("p"));
        assertNotNull(element.selectFirst("p"));
    }

}