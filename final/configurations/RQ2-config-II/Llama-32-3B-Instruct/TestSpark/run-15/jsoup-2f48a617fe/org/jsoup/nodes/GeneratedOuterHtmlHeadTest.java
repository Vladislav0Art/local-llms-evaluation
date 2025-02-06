package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getOutputMode()).thenReturn(Document.OutputMode.HTML);
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append("\n<!--");
    }

}