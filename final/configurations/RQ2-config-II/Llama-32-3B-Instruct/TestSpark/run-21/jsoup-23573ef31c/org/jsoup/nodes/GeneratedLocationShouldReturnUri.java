package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedLocationShouldReturnUri {

    @Test
    public void locationShouldReturnUri() {
        String uri = "http://example.com";
        Document document = new Document(uri);
        assertEquals(uri, document.location());
    }

}