package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.Document;
import org.mockito.Mockito;

public class GeneratedTitleSetsTitle {

    @Test
    public void titleSetsTitle() {
        Document document = Document.createShell("http://example.com");
        assertEquals("", document.title());
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

}