package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.QuirksMode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

public class GeneratedTitleSetterTest {

    @Test
    public void titleSetterTest() {
        Document document = new Document("http://example.com");
        String title = "Test Title";
        document.title(title);
        assertEquals(title, document.title());
    }

}