package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedConnectionMethodTest {

    @Test
    public void connectionMethodTest() {
        // Arrange and Act
        Connection connection = null;
        Document document = Document.createShell("http://example.com");
        Document result = document.connection(connection);

        // Assert
        assertNotNull(result);
    }

}