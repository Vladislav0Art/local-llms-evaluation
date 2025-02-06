package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadTextNode {

    @Test
    public void outerHtmlHeadTextNode() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = Document.parse("<p>Hello</p>");
        Appendable accum = outContent;
        TextNode textNode = new TextNode("World!");
        document.outputSettings().setOutputMode(Document.OutputMode.html);
        document.outerHtmlHead(accum, 1, document.outputSettings());
        String htmlOut = outContent.toString();
        assertTrue(htmlOut.contains("<p>Hello</p>"));
    }

}