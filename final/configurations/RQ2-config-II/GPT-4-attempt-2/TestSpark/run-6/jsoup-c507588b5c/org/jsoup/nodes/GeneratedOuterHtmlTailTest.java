package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Sample Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new OutputSettings().escapeMode(EscapeMode.xhtml));
        assertEquals("", accum.toString());
    }

}