package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document doc = new Document("https://example.com");
        FormElement form = doc.expectForm("div");
        assertNotNull(form);
    }

}