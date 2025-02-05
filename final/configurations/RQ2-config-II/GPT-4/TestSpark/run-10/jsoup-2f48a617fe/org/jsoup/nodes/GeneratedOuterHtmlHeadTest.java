package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("testComment");
        StringBuilder stringBuilder = new StringBuilder();
        comment.outerHtmlHead(stringBuilder, 0, new Document.OutputSettings());
        assertEquals("<--testComment-->", stringBuilder.toString());
    }

}