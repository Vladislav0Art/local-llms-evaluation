package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;

public class GeneratedCreateElement_ShouldReturnElementWithSameTagName {

    @Test
    public void createElement_ShouldReturnElementWithSameTagName() {
        String tagName = "div";
        Element element = document.createElement(tagName);
        assertNotNull(element);
        assertEquals(tagName, element.tagName());
    }

}