package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Generated[TextNode][Scenario]

Test_getOuterHtmlHead {

    @Test
    public void [TextNode][Scenario]Test_getOuterHtmlHead() {
        // Arrange
        Document document = new Document();
        document.appendChild(new TextNode("Hello World"));

        // Act
        String[] headContents = TextNode.getOuterHtmlHead(document, 1).split(",");

        // Assert
        assertNotNull(headContents);
    }

}