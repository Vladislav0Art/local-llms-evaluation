package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTitleSetterTest {

    @Test
    public void titleSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        document.title("Hello World");

        // Assert
        assertEquals("Hello World", document.title());
    }

}