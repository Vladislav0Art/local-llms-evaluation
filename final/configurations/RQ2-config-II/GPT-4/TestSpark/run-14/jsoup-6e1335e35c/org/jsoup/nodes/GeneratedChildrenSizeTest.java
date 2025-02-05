package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildrenSizeTest {

    @Test
    public void childrenSizeTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(0, element.childrenSize());

        element.appendChild(new Element(Tag.valueOf("p"), ""));
        assertEquals(1, element.childrenSize());
    }

}