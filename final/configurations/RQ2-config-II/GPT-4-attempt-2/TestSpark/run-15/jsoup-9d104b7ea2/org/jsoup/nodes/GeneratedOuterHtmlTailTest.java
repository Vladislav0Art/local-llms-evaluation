package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertTrue(accum.toString().isEmpty());
    }

}