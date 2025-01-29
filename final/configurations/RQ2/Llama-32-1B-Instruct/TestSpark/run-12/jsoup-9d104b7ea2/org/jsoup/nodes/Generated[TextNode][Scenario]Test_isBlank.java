package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Generated[TextNode][Scenario]

Test_isBlank {

    @Test
    public void [TextNode][Scenario]Test_isBlank() {
        // Arrange
        Document document = new Document();
        document.appendChild(new TextNode("");

        // Act
        boolean isBlank = TextNode.isBlank();

        // Assert
        assertTrue(isBlank);
    }

}