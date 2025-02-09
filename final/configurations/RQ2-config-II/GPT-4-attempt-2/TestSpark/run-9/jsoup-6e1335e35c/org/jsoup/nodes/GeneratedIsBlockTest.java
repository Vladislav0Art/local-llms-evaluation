package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Element element = new Element("div");
        assertTrue(element.isBlock());
    }

}