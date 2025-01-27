package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadGeneratesCorrectOutput {

    @Test
    public void outerHtmlHeadGeneratesCorrectOutput() throws IOException {
        StringBuilder accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("<p>Hello World!</p>");
        textNode.outerHtmlHead(accum, depth, out);
        String expectedOutput = "<html><body><p>Hello World!</p></body></html>";
        assertEquals(expectedOutput, accum.toString());
    }

}