package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedCreateElement_ValidTagName_ReturnsElement {

    @Test
    public void createElement_ValidTagName_ReturnsElement() {
        String tagName = "div";
        Document document = Document.createShell("");
        Element element = document.createElement(tagName);
        assertNotNull(element);
        assertTrue(Validate.isInstanceOf(element, Element.class));
    }
}

}