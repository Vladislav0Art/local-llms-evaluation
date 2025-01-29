package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Generated[TextNode][Scenario]

Test_splitText {

    @Test
    public void [TextNode][Scenario]Test_splitText() {
        // Arrange
        String text = "Hello World";
        Document document = new Document();
        document.appendChild(new TextNode(text));

        // Act
        TextNode[] splitTexts = TextNode.splitText(10);

        // Assert
        assertNotNull(splitTexts);
    }

}