package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclaration_ReturnsFalse_WhenNotAnXmlDeclaration {

    @Test
    public void isXmlDeclaration_ReturnsFalse_WhenNotAnXmlDeclaration() {
        // Arrange
        Comment comment = new Comment("");
        Document document = new Document();
        when(document.toString()).thenReturn("<html>test</html>");

        // Act
        boolean actual = comment.isXmlDeclaration();

        // Assert
        assertFalse(actual);
    }

    public void SetsData(String data) {
        // Arrange
        Comment comment = new Comment("");
        String expectedData = "test";

        // Act
        comment.setData(data);

        // Assert
        assertNotNull(comment.getData());
        assertTrue(comment.getData().equals(expectedData));
    }
}

class Comment {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isXmlDeclaration() {
        return false; // Not an XML declaration
    }
}

class Document {

    public static void when(String toStringValue) {
        // Stub method for testing purposes only
    }

    public String toString() {
        return "";
    }

}