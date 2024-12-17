package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeName_ReturnsExpectedValue {

    @Test
    public void nodeName_ReturnsExpectedValue() {
        // Arrange
        Comment comment = new Comment("");

        // Act
        String actual = comment.nodeName();

        // Assert
        assertEquals("", comment.nodeName());
    }

}