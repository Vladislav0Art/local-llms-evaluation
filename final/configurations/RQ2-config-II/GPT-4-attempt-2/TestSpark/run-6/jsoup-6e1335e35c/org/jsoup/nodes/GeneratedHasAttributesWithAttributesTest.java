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

public class GeneratedHasAttributesWithAttributesTest {

    @Test
    public void hasAttributesWithAttributesTest() {
        Attributes attributes = new Attributes();
        attributes.put("class", "test");
        Element element = new Element(Tag.valueOf("div"), "", attributes);
        assertTrue(element.hasAttributes());
    }

}