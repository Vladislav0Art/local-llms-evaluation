package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail DoesNotAppendAnything {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void outerHtmlTail

    DoesNotAppendAnything() {
        Comment comment = new Comment("");
        Appendable actualAccum = new StringBuffer();
        when(out.accum).thenReturn(actualAccum);
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", actualAccum.toString());
    }

}