package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("Test text");
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();

        node.outerHtmlTail(builder, 0, settings);

        assertEquals("", builder.toString());
    }

}