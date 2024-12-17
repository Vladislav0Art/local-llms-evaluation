package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class GeneratedOuterHtmlTail_isEmptyNoOutput {

    @Test
    public void outerHtmlTail_isEmptyNoOutput() {
        Comment comment = new Comment("");
        Document document = new Document();
        Element parentNode = new Element(document, "div");
        parentNode.appendChild(comment);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlTail(accum, depth, out);
        verify(accum).append(eq(""));
    }

}