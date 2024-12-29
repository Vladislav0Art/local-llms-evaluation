package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Test Text");
        StringBuilder builder = new StringBuilder();
        node.outerHtmlHead(builder, 0, new Document.OutputSettings());
        assertEquals("Test Text", builder.toString());
    }

}