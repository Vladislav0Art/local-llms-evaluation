package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedBody_ReturnsBodyElement {

    @Test
    public void body_ReturnsBodyElement() {
        Document document = Document.createShell("");
        Element body = document.body();
        assertNotNull(body);
        assertTrue(Validate.isInstanceOf(body, Element.class));
    }

}