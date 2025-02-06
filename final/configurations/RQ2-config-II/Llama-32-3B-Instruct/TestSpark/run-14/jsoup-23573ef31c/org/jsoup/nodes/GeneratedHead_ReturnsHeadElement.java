package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedHead_ReturnsHeadElement {

    @Test
    public void head_ReturnsHeadElement() {
        Document document = Document.createShell("");
        Element head = document.head();
        assertNotNull(head);
        assertTrue(Validate.isInstanceOf(head, Element.class));
    }

}