package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedOuterHtmlHeadTest_ShouldReturnSameValueAsToString {

    @Test
    public void outerHtmlHeadTest_ShouldReturnSameValueAsToString() throws IOException {
        TextNode textNode = new TextNode("Lorem ipsum");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Lorem ipsum", accum.toString());
    }

}