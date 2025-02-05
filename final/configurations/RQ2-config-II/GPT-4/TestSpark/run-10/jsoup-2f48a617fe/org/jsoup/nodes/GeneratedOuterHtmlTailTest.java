package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("testComment");
        StringBuilder stringBuilder = new StringBuilder();
        comment.outerHtmlHead(stringBuilder, 0, new Document.OutputSettings());
        assertEquals("", stringBuilder.toString());   // As implementation doesn't append anything, expecting nothing.
    }

}