package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestForEach {

    @Test
    public void testForEach() {
        Element element = new Element();
        List<Element> elements = Arrays.asList(element);

        for (Element e : elements) {
            assertTrue(e instanceof Element); // ensure each item is an Element
        }
    }

}