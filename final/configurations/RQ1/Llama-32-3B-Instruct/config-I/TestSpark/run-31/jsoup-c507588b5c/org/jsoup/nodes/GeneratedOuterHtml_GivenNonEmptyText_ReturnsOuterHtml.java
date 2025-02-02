package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedOuterHtml_GivenNonEmptyText_ReturnsOuterHtml {

    @Test
    public void outerHtml_GivenNonEmptyText_ReturnsOuterHtml() throws IOException {
        String text = "Hello World";
        Node textNode = new Node(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();
        textNode.outerHtmlHead(out, 0, settings);
        assertEquals("<p>Hello World</p>", out.toString());
    }

}