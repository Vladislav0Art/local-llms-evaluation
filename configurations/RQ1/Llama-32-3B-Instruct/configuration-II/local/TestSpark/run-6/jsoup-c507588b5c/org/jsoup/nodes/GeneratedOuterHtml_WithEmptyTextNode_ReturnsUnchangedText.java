package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedOuterHtml_WithEmptyTextNode_ReturnsUnchangedText {

    @Test
    public void outerHtml_WithEmptyTextNode_ReturnsUnchangedText() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(new StringBuffer(), 0, settings);
        String outerHtml = outContent.toString();
        assertEquals("", outerHtml.trim());
    }

}