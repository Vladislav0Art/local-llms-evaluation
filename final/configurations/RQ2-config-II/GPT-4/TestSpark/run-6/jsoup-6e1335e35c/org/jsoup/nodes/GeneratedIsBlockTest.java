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

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Element blockElement = new Element("div");
        assertTrue(blockElement.isBlock());

        Element inlineElement = new Element("span");
        assertFalse(inlineElement.isBlock());
    }

}