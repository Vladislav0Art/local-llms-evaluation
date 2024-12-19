package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedCharset {

    @Test
    public void charset() {
        // Arrange
        String baseUri = "https://example.com";
        Charset charset = Charset.UTF_8;

        // Act
        Document document = new Document(new Element("html"), null, null, new Element("head", new ElementTag("meta", new ElementAttr("charset", charset))), null);

        // Assert
        assertNotNull(document.charset());
    }

}