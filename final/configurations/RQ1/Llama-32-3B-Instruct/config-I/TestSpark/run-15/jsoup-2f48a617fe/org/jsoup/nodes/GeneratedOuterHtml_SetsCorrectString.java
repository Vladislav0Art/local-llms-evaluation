package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtml_SetsCorrectString {

    @Test
    public void outerHtml_SetsCorrectString() {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("This is a comment");
        comment.outerHtml(accum, depth, out);
        assertEquals("<!--This is a comment-->", accum.toString());
    }

}