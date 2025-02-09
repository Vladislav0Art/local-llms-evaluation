package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element element = new Element("p");
        Element clonedElement = element.clone();

        assertNotEquals(System.identityHashCode(element), System.identityHashCode(clonedElement));
        assertEquals(element.nodeName(), clonedElement.nodeName());
    }

}