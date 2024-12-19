package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedOuterHtmlHead_HtmlWithSpaces {

    @Test
    public void outerHtmlHead_HtmlWithSpaces() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(outContent);
        Document.OutputSettings settings = new Document.OutputSettings(true, false);
        TextNode textNode = new TextNode("   ");
        textNode.outerHtmlHead(writer, 1, settings);
        assertEquals("<br/>", outContent.toString().trim());
    }

}