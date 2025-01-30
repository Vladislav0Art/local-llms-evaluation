package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document doc = new Document("http://google.com");
        doc.head().appendElement("title").text("Google");
        assertEquals("Google", doc.title());
    }

}