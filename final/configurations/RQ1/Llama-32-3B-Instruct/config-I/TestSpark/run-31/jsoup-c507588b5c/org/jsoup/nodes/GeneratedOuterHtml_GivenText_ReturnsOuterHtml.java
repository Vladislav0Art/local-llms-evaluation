package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedOuterHtml_GivenText_ReturnsOuterHtml {

    @Test
    public void outerHtml_GivenText_ReturnsOuterHtml() throws IOException {
        Node textNode = new Node("");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();
        textNode.outerHtmlHead(out, 0, settings);
        assertEquals("<p></p>", out.toString());
    }

}