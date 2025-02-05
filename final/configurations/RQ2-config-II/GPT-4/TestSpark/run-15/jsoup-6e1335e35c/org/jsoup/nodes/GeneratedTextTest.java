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

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Element element = new Element("p");
        element.appendChild(new TextNode("Test text"));
        assertEquals("Test text", element.text());
    }

}