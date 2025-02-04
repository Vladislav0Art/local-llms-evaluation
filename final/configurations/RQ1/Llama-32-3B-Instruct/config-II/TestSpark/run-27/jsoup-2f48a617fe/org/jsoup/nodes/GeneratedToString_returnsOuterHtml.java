package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;

public class GeneratedToString_returnsOuterHtml {

    @Test
    public void toString_returnsOuterHtml() throws IOException, CloneNotSupportedException {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- data -->");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!-- data -->", comment.toString());
    }

}