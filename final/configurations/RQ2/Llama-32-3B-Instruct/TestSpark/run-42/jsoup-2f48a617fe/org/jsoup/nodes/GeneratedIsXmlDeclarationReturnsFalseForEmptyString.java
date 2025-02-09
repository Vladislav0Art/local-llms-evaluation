package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationReturnsFalseForEmptyString {

    @Test
    public void isXmlDeclarationReturnsFalseForEmptyString() {
        // Arrange
        Comment comment = new Comment("");

        // Act and Assert
        assertFalse(comment.isXmlDeclaration());
    }

}