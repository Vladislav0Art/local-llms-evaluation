package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("Test Text");
        StringBuilder builder = new StringBuilder();
        node.outerHtmlTail(builder, 0, new Document.OutputSettings());
        assertEquals("", builder.toString());
    }

}