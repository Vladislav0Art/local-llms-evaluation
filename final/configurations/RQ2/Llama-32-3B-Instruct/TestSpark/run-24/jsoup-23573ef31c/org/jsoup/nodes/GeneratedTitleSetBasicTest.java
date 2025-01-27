package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTitleSetBasicTest {

    @Test
    public void titleSetBasicTest() {
        Document document = new Document("http://example.com");
        document.title("Test Title");
        String title = document.title();
        org.junit.Assert.assertEquals("Test Title", title);
    }

}