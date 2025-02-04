package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail_commentOnly {

    @Test
    public void outerHtmlTail_commentOnly() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("This is a test");
        comment.outerHtmlTail(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

}