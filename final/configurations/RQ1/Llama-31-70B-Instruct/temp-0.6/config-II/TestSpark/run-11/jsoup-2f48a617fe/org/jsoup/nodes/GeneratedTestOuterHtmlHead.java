package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Comment comment = new Comment("Some text");
        Appendable accum = Mockito.mock(Appendable.class);
        Comment.OutputSettings out = Mockito.mock(Comment.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);
        Mockito.when(out.outline()).thenReturn(true);
        comment.outerHtmlHead(accum, 0, out);
        Mockito.verify(accum).append("<!--Some text-->");
    }

}