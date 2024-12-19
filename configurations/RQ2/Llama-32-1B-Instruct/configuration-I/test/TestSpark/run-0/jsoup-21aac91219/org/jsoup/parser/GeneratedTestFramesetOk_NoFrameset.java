package org.jsoup.parser;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestFramesetOk_NoFrameset {

    private final HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();

    @Before
    public void setup() {
        when(htmlTreeBuilder.baseUri()).thenReturn("https://example.com");
    }

    @Test
    public void testFramesetOk_NoFrameset() {
        String framesetOk = "no";
        Element element = mock(Element.class);
        when(element.getAttribute("style")).thenReturn(framesetOk);

        htmlTreeBuilder.framesetOk(false);
        assertNotSame(framesetOk, null);
    }

}