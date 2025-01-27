package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadIsCalledWithCorrectArguments {

    @Test
    public void outerHtmlHeadIsCalledWithCorrectArguments() throws IOException {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("test");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!-- test -->", accum.toString());
    }

}