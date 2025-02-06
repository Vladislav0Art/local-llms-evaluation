package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedExpectFormElementCreationTest {

    @Test
    public void expectFormElementCreationTest() {
        Document document = new Document("http://example.com");
        FormElement form = document.expectForm("form");
        assertNotNull(form);
    }

}