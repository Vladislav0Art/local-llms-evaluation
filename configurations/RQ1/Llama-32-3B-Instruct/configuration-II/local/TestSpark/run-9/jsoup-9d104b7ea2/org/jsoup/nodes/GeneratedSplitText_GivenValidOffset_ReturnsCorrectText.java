package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_GivenValidOffset_ReturnsCorrectText {

    @Test
    public void splitText_GivenValidOffset_ReturnsCorrectText() throws IOException {
        String text = "Hello, World!";
        int offset = 7;
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();
        textNode.outerHtmlHead(output, 0, settings);
        TextNode result = (TextNode) textNode.splitText(offset).clone().outerHtmlHead(null, 0, settings);
        assertEquals("Hello,", result.text());
    }

}