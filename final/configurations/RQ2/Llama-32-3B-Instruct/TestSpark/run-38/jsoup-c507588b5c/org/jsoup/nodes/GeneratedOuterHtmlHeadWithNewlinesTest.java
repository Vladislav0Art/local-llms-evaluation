package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedOuterHtmlHeadWithNewlinesTest {

    @Test
    public void outerHtmlHeadWithNewlinesTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("\nHello\nWorld");
        textNode.outerHtmlHead(accum, 0, out);
        String expectedOutput = "<br><b>Hello</b></br><br><b>World</b>";
        assertEquals(expectedOutput, accum.toString());
    }

}