package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHead_appendsCommentData {

    @Test
    public void outerHtmlHead_appendsCommentData() throws IOException, CloneNotSupportedException {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Document doc = new Document();
        Element element = new Element("div");
        doc.appendChild(element);
        comment = new Comment("<!-- data -->");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!-- data -->", accum.toString());
    }

}