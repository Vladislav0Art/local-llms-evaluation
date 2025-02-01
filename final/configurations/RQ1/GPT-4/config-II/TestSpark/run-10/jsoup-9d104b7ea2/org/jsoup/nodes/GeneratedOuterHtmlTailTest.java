package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document.OutputSettings());

        assertEquals("", accum.toString());
    }

}