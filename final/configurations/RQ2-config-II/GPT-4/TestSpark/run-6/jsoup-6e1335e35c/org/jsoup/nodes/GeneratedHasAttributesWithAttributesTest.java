package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeVisitor;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.NodeFilter;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasAttributesWithAttributesTest {

    @Test
    public void hasAttributesWithAttributesTest() {
        Element element = new Element(Tag.valueOf("p"), "", new Attributes());
        element.attr("key", "value");
        assertTrue(element.hasAttributes());
    }

}