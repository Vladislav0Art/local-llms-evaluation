package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestSplitText {

    public static Document createTextNode(String text) {
        return new Document();
    }

    @Test
    public void TestSplitText() {
        // Arrange
        String text = "Hello World";
        int offset = 5;

        // Act
        TextNode textNode = new TextNode(text);
        Document doc = createTextNode(textNode.splitText(offset).text());
        String result = doc.text();

        // Assert
        assertEquals("World", result);
    }

}