package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHead_appendsCorrectNodeWithEmptyString {

    @Test
    public void outerHtmlHead_appendsCorrectNodeWithEmptyString() throws IOException {
        StringBuilder expected = new StringBuilder("<p></p>");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        TextNode node = new TextNode("");
        node.outerHtmlHead(accum, 0, out);
        assertEquals(expected.toString(), accum.toString());
    }

}