package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        String title = "Test Title";
        Document doc = Document.createShell("http://example.com");
        doc.title(title);
        assertEquals(title, doc.title());
    }

}