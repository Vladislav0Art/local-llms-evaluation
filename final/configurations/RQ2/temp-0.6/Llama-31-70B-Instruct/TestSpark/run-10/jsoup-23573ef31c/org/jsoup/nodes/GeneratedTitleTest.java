package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = new Document("https://www.example.com");
        document.title("Hello World");
        assertEquals("Hello World", document.title());
    }

}