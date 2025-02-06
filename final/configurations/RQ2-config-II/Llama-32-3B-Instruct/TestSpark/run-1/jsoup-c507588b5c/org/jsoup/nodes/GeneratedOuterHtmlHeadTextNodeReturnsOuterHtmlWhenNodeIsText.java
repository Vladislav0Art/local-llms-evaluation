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

public class GeneratedOuterHtmlHeadTextNodeReturnsOuterHtmlWhenNodeIsText {

    @Test
    public void outerHtmlHeadTextNodeReturnsOuterHtmlWhenNodeIsText() throws IOException {
        // Arrange
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // Act
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Document.OutputSettings outSettings = Document.OutputSettings.DEFAULT;
        Appendable accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, outSettings);
        accum.toString();

        // Assert
        assertTrue(accum.toString().contains("<p>Hello World</p>"));
    }

}