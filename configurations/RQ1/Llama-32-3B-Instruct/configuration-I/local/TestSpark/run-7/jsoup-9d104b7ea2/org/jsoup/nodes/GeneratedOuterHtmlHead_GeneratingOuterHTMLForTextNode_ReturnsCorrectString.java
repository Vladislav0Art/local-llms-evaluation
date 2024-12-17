package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_GeneratingOuterHTMLForTextNode_ReturnsCorrectString {

    @Test
    public void outerHtmlHead_GeneratingOuterHTMLForTextNode_ReturnsCorrectString() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = new Document();
        TextNode textNode = new TextNode("   ");
        Element parentNode = new Element();
        textNode.setParentNode(parentNode);
        textNode.addChildren(0, null);

        try {
            textNode.outerHtmlHead(outContent, 1, new Document.OutputSettings());
        } catch (IOException e) {
            fail(e.getMessage());
        }

        String expectedOutput = "<span>   </span>";
        assertEquals(expectedOutput, outContent.toString());
    }

}