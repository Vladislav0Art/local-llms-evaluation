package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail_SetsOuterHtmlTailOfTextNode {

    @Test
    public void outerHtmlTail_SetsOuterHtmlTailOfTextNode() {
        String text = "Hello, World!";
        int depth = 1;
        Document.OutputSettings out = null;
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        textNode.outerHtmlTail(outStream, depth, out);
        assertEquals("", outStream.toString());
    }

}