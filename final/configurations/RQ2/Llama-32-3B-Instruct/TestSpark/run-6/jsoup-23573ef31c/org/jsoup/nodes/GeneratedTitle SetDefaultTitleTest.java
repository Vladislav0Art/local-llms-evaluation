package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTitle SetDefaultTitleTest {

    @Test
    public void title

    SetDefaultTitleTest() {
        Document document = new Document("http://example.com");
        String defaultTitle = document.title();
        assertEquals("", defaultTitle);
    }

}