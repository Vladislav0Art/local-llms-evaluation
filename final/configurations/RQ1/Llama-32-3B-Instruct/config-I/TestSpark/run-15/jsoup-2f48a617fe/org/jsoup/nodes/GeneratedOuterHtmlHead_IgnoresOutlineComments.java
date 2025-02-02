package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedOuterHtmlHead_IgnoresOutlineComments {

    @Test
    public void outerHtmlHead_IgnoresOutlineComments() {
        Document document = Document.parse("<html><body><!--<!--This is a comment--!-->--></body></html>");
        Comment comment = new Comment("This is a comment");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        out.outline(true);
        comment.outerHtmlHead(accum, depth, out);
        assertTrue(accum.toString().contains("<!--This is a comment-->"));
    }

}