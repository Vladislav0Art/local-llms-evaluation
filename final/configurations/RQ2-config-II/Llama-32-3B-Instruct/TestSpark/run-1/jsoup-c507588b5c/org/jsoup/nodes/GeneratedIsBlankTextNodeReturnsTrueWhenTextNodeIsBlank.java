package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.select.Elements;

public class GeneratedIsBlankTextNodeReturnsTrueWhenTextNodeIsBlank {

    @Test
    public void isBlankTextNodeReturnsTrueWhenTextNodeIsBlank() {
        // Arrange
        String text = "   ";
        TextNode textNode = new TextNode(text);

        // Act
        boolean result = textNode.isBlank();

        // Assert
        assertTrue(result);
    }

}