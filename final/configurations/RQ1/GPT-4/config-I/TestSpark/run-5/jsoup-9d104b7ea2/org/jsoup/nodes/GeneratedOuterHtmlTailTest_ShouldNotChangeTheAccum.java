package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedOuterHtmlTailTest_ShouldNotChangeTheAccum {

    @Test
    public void outerHtmlTailTest_ShouldNotChangeTheAccum() throws IOException {
        TextNode textNode = new TextNode("");
        StringBuilder accum = new StringBuilder("Lorem ipsum");
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 0, out);
        assertEquals("Lorem ipsum", accum.toString());
    }

}