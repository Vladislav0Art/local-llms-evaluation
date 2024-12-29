package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedGetWholeText_SimpleText {

    @Test
    public void getWholeText_SimpleText() throws IOException {
        // Arrange
        Document document = new Document();
        TextNode node = new TextNode("Hello World");

        // Act
        String wholeText = node.getWholeText();

        // Assert
        assertEquals("Hello World", wholeText);
    }

}