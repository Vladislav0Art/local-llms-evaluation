package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedSplitText_SplitAtOffset {

    @Test
    public void splitText_SplitAtOffset() throws IOException {
        // Arrange
        Document document = new Document();
        TextNode node = new TextNode("Hello World");

        // Act
        String[] result = node.splitText(6);

        // Assert
        String[] expected = {"Hello", "World"};
        assertArrayEquals(expected, result);
    }

}