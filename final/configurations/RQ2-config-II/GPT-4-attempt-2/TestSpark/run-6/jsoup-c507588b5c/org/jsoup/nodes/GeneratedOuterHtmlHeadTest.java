package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Sample Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new OutputSettings().escapeMode(EscapeMode.xhtml));
        assertEquals("Sample Text", accum.toString());
    }

}