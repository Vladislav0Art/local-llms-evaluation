package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTailIsCalledWithCorrectArguments {

    @Test
    public void outerHtmlTailIsCalledWithCorrectArguments() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("test");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("<!-- test -->", accum.toString());
    }

}