package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Generated[TextNode][Scenario]

TestToString {

    @Test
    public void [TextNode][Scenario]TestToString() {
        // Arrange
        Document document = new Document();
        document.appendChild(new TextNode("Hello World"));

        // Act
        String text = TextNode.toString();

        // Assert
        assertEquals("text", text);
    }

}