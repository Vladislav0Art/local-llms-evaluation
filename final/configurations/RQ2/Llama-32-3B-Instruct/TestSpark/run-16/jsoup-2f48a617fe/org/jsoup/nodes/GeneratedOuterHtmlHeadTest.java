package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable accum = org.junit.Mockito.mock(Appendable.class);
        int depth = 0;
        org.jsoup.parser.Document.OutputSettings out = org.jsoup.parser.Document.OutputSettings.class;

        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);

        org.junit.Mockito.verify(accum).append(org.junit.Mockito.any());
    }

}