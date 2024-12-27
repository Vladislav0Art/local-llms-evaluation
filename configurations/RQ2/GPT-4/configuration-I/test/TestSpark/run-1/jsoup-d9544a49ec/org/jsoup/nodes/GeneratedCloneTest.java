package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element element = new Element("tag");
        Element clonedElement = element.clone();
        assertEquals(clonedElement, element);
        assertNotSame(clonedElement, element);
    }

}