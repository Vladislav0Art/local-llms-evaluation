package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTail DoesNotAppendAnything {

    @Test
    public void outerHtmlTail

    DoesNotAppendAnything() {
        Comment comment = new Comment("Some data");
        Appendable accum = mock(appendable.class);
        Document.OutputSettings out = mock(outputSettings.class);
        comment.outerHtmlTail(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

}