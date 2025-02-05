package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSelectFirstTest {

    @Test
    public void selectFirstTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        child.id("test");
        element.appendChild(child);

        Element result = element.selectFirst("#test");
        assertEquals(child, result);
    }

}