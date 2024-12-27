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

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        String text = "Test text";
        element.text(text);
        assertEquals(text, element.text());
    }

}