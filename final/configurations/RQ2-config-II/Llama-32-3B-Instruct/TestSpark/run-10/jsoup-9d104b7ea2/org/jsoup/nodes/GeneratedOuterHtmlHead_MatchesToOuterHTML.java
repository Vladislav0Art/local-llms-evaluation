package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlHead_MatchesToOuterHTML {

    @Test
    public void outerHtmlHead_MatchesToOuterHTML() {
        String expected = "<p>TextNode</p>";
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when("toString").thenReturn(expected);
        when(out.getOutput()).thenReturn(accum);
        ((TextNode) mock(TextNode)).outerHtmlHead(accum, 1, out);
        verify(accum).append(expected);
    }

}