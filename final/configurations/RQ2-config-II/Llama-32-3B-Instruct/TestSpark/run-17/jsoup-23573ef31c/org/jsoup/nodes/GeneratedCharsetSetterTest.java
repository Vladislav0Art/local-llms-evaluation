package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedCharsetSetterTest {

    @Test
    public void charsetSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);

        // Assert
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

}