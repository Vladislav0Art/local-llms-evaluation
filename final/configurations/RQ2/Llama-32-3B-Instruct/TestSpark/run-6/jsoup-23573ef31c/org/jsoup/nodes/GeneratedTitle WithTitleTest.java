package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTitle WithTitleTest {

    @Test
    public void title

    WithTitleTest() {
        Document document = new Document("http://example.com");
        document.title("My Title");
        assertEquals("My Title", document.title());
    }

}