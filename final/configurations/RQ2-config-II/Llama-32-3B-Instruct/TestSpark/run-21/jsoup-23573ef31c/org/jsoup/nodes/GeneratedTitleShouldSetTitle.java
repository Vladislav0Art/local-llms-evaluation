package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTitleShouldSetTitle {

    @Test
    public void titleShouldSetTitle() {
        String title = "test";
        Document document = new Document("http://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

}