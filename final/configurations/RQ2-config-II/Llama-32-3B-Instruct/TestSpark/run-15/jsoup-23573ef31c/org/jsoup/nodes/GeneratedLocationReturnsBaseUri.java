package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.Document;
import org.mockito.Mockito;

public class GeneratedLocationReturnsBaseUri {

    @Test
    public void locationReturnsBaseUri() {
        Document document = Document.createShell("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}