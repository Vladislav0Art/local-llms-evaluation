package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNodeNameIsElement {

    @Test
    public void nodeNameIsElement() {
        Element element = new Element();
        assertEquals("element", element.nodeName());
    }

}