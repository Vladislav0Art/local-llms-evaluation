package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);
        Mockito.when(out.outline()).thenReturn(true);
        comment.outerHtmlHead(accum, 1, out);
        Mockito.verify(accum).append("<!--");
        Mockito.verify(accum).append("test");
        Mockito.verify(accum).append("-->");
    }

}