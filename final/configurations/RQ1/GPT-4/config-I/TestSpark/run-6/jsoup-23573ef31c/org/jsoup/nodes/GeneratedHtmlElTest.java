package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedHtmlElTest {

    private static final String BASE_URI = "http://example.com/";

    @Test
    public void htmlElTest() {
        Document document = new Document(BASE_URI);
        Element htmlEl = document.appendElement("html");
        assertEquals(htmlEl, document.htmlEl());
    }

}