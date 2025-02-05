package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributesTest {

    @Test
    public void attributesTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(0, element.attributes().size());
    }

}