package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Appendable accum = classOf(Appendable.class);
        int depth = 0;
        org.jsoup.parser.Document.OutputSettings out = classOf(Document.OutputSettings.class);

        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);

        org.junit.Mockito.verify(accum).append(org.junit.Mockito.any());
    }

}