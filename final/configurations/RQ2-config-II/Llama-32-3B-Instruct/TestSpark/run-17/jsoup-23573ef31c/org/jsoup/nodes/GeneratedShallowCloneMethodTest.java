package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedShallowCloneMethodTest {

    @Test
    public void shallowCloneMethodTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        Document shallowClone = document.shallowClone();

        // Assert
        assertNotNull(shallowClone);
        assertNotSame(document, shallowClone);
    }

}