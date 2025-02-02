package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedOuterHtml {

    @Test
    public void outerHtml() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = new Document();
        TextNode textNode = new TextNode("This is a test");
        document.appendChild(textNode);
        textNode.outerHtmlHead(outContent, 0, Document.OutputSettings.get());
        assertEquals("<p>This is a test</p>", outContent.toString());
    }

}