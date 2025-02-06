package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_SetsOuterHtmlHeadOfTextNode {

    @Test
    public void outerHtmlHead_SetsOuterHtmlHeadOfTextNode() throws IOException {
        String text = "Hello, World!";
        int depth = 1;
        Document.OutputSettings out = null;
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        textNode.outerHtmlHead(outStream, depth, out);
        assertEquals("div><p>Hello, World!</p></div>", outStream.toString());
    }

}