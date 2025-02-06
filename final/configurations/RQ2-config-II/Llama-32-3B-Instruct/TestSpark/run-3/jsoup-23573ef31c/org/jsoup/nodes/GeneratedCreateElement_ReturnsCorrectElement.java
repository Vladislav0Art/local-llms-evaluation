package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCreateElement_ReturnsCorrectElement {

    @Test
    public void createElement_ReturnsCorrectElement() {
        String tagName = "div";
        Document document = new Document();
        Element element = document.createElement(tagName);
        assertNotNull(element);
        assertEquals(tagName, element.tagName());
    }

}