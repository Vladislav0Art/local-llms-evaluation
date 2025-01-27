package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedLocation WithLocationTest {

    @Test
    public void location

    WithLocationTest() {
        Document document = new Document("http://example.com");
        document.location("http://localhost:8080");
        assertEquals("http://localhost:8080", document.location());
    }

}