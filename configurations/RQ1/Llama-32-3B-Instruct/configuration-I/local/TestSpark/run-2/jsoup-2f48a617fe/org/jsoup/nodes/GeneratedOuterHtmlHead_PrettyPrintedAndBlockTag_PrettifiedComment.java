package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class GeneratedOuterHtmlHead_PrettyPrintedAndBlockTag_PrettifiedComment {

    @Test
    public void outerHtmlHead_PrettyPrintedAndBlockTag_PrettifiedComment() throws IOException {
        Comment comment = new Comment("This is a comment");
        Document document = new Document();
        Element parentNode = new Element(document, "div");
        parentNode.appendChild(comment);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(eq("<!--This is a comment-->"));
    }

}