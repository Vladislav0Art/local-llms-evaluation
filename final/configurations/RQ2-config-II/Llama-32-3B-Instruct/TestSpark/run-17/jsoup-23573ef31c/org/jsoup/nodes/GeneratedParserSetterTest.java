package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedParserSetterTest {

    @Test
    public void parserSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        Parser parser = new Parser();
        Document result = document.parser(parser);

        // Assert
        assertNotNull(result);
    }

}