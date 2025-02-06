package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getOutputMode()).thenReturn(Document.OutputMode.HTML);
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        verify(accum).append("-->\n");
    }

}