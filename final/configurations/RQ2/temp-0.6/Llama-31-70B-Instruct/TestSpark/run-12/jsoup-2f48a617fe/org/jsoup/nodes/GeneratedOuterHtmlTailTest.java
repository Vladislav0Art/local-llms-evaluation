package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, depth, out);
        Mockito.verify(accum).append("");
    }

}