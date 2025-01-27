package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedLocation DefaultLocationTest {

    @Test
    public void location

    DefaultLocationTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}