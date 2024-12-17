package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetData SetsData {

    @Test
    public void setData

    SetsData() {
        // Arrange
        Comment comment = new Comment("");
        String data = "test";

        // Act
        comment.setData(data);

        // Assert
        assertNotNull(comment.getData());
        assertTrue(comment.getData().equals(data));
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