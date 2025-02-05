package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        Element clonedElement = element.shallowClone();
        assertEquals(element, clonedElement);
    }

}