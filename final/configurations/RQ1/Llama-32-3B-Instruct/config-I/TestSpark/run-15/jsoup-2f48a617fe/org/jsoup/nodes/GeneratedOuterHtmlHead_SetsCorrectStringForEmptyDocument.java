package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlHead_SetsCorrectStringForEmptyDocument {

    @Test
    public void outerHtmlHead_SetsCorrectStringForEmptyDocument() {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("", accum.toString());
    }

}