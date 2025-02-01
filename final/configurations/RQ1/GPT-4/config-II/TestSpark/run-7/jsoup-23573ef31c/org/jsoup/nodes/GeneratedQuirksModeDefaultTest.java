package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.select.Elements;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedQuirksModeDefaultTest {

    @Test
    public void quirksModeDefaultTest() {
        Document document = new Document("https://www.google.com");
        assertEquals(Document.QuirksMode.noQuirks, document.quirksMode());
    }

}