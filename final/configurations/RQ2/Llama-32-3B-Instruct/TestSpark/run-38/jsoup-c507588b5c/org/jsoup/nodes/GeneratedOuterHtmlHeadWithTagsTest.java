package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedOuterHtmlHeadWithTagsTest {

    @Test
    public void outerHtmlHeadWithTagsTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("<a>Hello</a>");
        textNode.outerHtmlHead(accum, 0, out);
        String expectedOutput = "<a><b>Hello</b></a>";
        assertEquals(expectedOutput, accum.toString());
    }

}