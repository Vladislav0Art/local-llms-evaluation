package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateElement SetsTagNameAttribute {

    @Test
    public void createElement

    SetsTagNameAttribute() {
        String tagName = "p";
        Element element = new Document("").createElement(tagName);
        assertTrue(element instanceof Element);
        assertEquals(tagName, ((Element) element).nodeName());
    }

}