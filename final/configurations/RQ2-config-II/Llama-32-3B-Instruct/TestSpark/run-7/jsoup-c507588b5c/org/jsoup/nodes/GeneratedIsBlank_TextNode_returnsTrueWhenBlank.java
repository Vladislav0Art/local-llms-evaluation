package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedIsBlank_TextNode_returnsTrueWhenBlank {

    @Test
    public void isBlank_TextNode_returnsTrueWhenBlank() {
        // Arrange
        TextNode node1 = new TextNode("");
        TextNode node2 = new TextNode("   ");

        // Act & Assert
        assertTrue(node1.isBlank());
        assertFalse(node2.isBlank());
    }

}