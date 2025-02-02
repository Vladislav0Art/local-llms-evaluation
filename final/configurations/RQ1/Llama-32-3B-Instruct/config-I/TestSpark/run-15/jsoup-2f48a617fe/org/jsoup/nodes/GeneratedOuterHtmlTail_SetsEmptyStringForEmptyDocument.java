package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlTail_SetsEmptyStringForEmptyDocument {

    @Test
    public void outerHtmlTail_SetsEmptyStringForEmptyDocument() {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

}