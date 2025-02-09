package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedBody_ReturnsEmptyElement {

    @Test
    public void body_ReturnsEmptyElement() {
        Document document = new Document("");
        Element element = document.body();
        assertTrue(element instanceof Element);
        assertEquals("BODY", ((Element) element).nodeName());
    }

}