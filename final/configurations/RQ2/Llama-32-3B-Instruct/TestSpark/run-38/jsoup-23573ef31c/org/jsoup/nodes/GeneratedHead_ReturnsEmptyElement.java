package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedHead_ReturnsEmptyElement {

    @Test
    public void head_ReturnsEmptyElement() {
        Document document = new Document("");
        Element element = document.head();
        assertTrue(element instanceof Element);
        assertEquals("HEAD", ((Element) element).nodeName());
    }

}