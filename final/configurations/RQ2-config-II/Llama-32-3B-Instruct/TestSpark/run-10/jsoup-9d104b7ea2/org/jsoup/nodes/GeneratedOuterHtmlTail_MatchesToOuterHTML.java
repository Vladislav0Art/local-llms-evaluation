package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlTail_MatchesToOuterHTML {

    @Test
    public void outerHtmlTail_MatchesToOuterHTML() {
        String expected = "</p>";
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when("toString").thenReturn(expected);
        when(out.getOutput()).thenReturn(accum);
        ((TextNode) mock(TextNode)).outerHtmlTail(accum, 1, out);
        verify(accum).append(expected);
    }

}