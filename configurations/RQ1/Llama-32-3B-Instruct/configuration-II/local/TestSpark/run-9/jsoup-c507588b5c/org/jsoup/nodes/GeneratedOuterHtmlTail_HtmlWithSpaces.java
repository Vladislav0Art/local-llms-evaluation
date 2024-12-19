package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedOuterHtmlTail_HtmlWithSpaces {

    @Test
    public void outerHtmlTail_HtmlWithSpaces() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(outContent);
        Document.OutputSettings settings = new Document.OutputSettings(true, false);
        TextNode textNode = new TextNode("   ");
        textNode.outerHtmlTail(writer, 1, settings);
    }

}