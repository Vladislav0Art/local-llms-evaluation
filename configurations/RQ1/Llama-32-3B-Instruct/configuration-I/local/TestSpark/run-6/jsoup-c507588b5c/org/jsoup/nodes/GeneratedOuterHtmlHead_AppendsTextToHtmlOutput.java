package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHead_AppendsTextToHtmlOutput {

    @Test
    public void outerHtmlHead_AppendsTextToHtmlOutput() throws IOException, InterruptedException {
        TextNode textNode = new TextNode("");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = new StringBuilder(out);
        Document.OutputSettings settings = new Document.OutputSettings(true);
        textNode.outerHtmlHead(accum, 0, settings);
        String html = out.toString().trim();
        assertEquals("", html);
    }

}