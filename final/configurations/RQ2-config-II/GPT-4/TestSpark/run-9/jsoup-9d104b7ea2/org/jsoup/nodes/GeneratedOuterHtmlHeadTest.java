package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Test text");
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();

        node.outerHtmlHead(builder, 0, settings);

        assertEquals("Test text", builder.toString());
    }

}