package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedOuterHtmlTailWithNewlinesTest {

    @Test
    public void outerHtmlTailWithNewlinesTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("\nHello\nWorld");
        textNode.outerHtmlTail(accum, 0, out);
        String expectedOutput = "</br><br></b>";
        assertEquals(expectedOutput, accum.toString());
    }

}