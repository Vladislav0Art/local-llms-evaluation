package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTail_doesNothing {

    @Test
    public void outerHtmlTail_doesNothing() throws IOException, CloneNotSupportedException {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- data -->");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("", accum.toString());
    }

}