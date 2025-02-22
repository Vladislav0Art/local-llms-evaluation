package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        Comment comment = new Comment("Some text");
        Appendable accum = Mockito.mock(Appendable.class);
        Comment.OutputSettings out = Mockito.mock(Comment.OutputSettings.class);
        comment.outerHtmlTail(accum, 0, out);
    }

}