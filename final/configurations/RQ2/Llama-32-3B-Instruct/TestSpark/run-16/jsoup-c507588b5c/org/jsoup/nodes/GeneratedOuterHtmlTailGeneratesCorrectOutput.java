package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailGeneratesCorrectOutput {

    @Test
    public void outerHtmlTailGeneratesCorrectOutput() {
        StringBuilder accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("<p>Hello World!</p>");
        textNode.outerHtmlTail(accum, depth, out);
        String expectedOutput = "</body></html>";
        assertEquals(expectedOutput, accum.toString());
    }

}