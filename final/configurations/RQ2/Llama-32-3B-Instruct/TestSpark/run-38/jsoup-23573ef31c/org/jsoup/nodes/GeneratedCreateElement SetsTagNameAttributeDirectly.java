package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateElement SetsTagNameAttributeDirectly {

    @Test
    public void createElement

    SetsTagNameAttributeDirectly() {
        String tagName = "p";
        Element element = new Document("").createElement(tagName);
        assertTrue(element instanceof org.jsoup.nodes.Element);
        org.jsoup.nodes.Element actualElement = (org.jsoup.nodes.Element) element;
        assertEquals(tagName, actualElement.tagName());
    }

}