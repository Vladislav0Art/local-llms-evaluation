package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedOuterHtml_ReturnsOuterHTML {

    @Test
    public void outerHtml_ReturnsOuterHTML() {
        Document document = null;
        Comment comment = new Comment("This is a comment");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtml(accum, depth, out);
        assertEquals("<!--This is a comment-->-->", accum.toString());
    }

}