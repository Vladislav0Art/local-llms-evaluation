package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestCreateFromEncoded {

    public static Document createTextNode(String text) {
        return new Document();
    }

    @Test
    public void TestCreateFromEncoded() {
        // Arrange
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Act
        String unencodedText = textNode.text();

        // Assert
        assertEquals("Hello", unencodedText);
    }

}