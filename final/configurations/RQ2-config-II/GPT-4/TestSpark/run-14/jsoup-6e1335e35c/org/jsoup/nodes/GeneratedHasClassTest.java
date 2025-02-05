package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasClassTest {

    @Test
    public void hasClassTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.addClass("testClass");
        assertTrue(element.hasClass("testClass"));
    }

}