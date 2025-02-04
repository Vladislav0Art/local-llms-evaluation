package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailWithBlankTextNodeReturnsEmptyString {

    @Test
    public void outerHtmlTailWithBlankTextNodeReturnsEmptyString() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings(true, false, true);
        TextNode node = new TextNode("");
        Document document = new Document(new Element("#text"));
        node.parentNode = document;
        document.outerHtmlTail(outContent, 0, settings);
        assertEquals("", outContent.toString());
    }

}